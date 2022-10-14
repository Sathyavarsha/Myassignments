package week2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
	
			// 1	Launch the browser
			WebDriverManager.chromedriver().setup();				
			ChromeDriver driver=new ChromeDriver();	
			// http://leaftaps.com/opentaps/control/main
			driver.get("http://leaftaps.com/opentaps/control/main");		
			// Maximise the window
			driver.manage().window().maximize();		
			// Add implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			// 2	Enter the username
			driver.findElement(By.id("username")).sendKeys("demosalesManager");	
			// 3	Enter the password
		    driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");	
		    // 4	Click Login
		    driver.findElement(By.className("decorativeSubmit")).click();	
		    // 5	Click crm/sfa link
		    driver.findElement(By.linkText("CRM/SFA")).click();
		    // 6   Click Leads link
		    driver.findElement(By.linkText("Leads")).click();
		    // 7	Click Find leads
		    driver.findElement(By.linkText("Find Leads")).click();
		    // 8	Enter first name
		    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sathya");
		    // 9	Click Find leads button or text basedxpath		 		    
		    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		    Thread.sleep(3000);
		    //10 	Click on first resulting lead
		    driver.findElement(By.xpath("((//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1])")).click();
		    //11    Verify title of the page
		    String title=driver.getTitle();
			System.out.println(title);	
			//12    Click Edit			
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			//13	Change the company name			
			driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
			driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Testleaf");						
			//14    Click Update
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();
			//15    Confirm the changed name appears
			System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());
			//16    Close the browser (Do not log out)
			driver.close();
	}

}
