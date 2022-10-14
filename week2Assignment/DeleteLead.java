package week2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
				    // 8	Click on phone
				    driver.findElement(By.linkText("Phone")).click();
				    // 9	Enter phone number
				    driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
				    driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("1");
				    //10	Click find leads button
				    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				    Thread.sleep(3000);
				    //11	Capture lead ID of First Resulting lead
				    String title = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
					System.out.println(title);
				    //12	Click First Resulting lead
					driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
				    //13	Click Delete
					driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
					//14	Click Find leads
					driver.findElement(By.linkText("Find Leads")).click();
					//15	Enter captured lead ID 
					driver.findElement(By.xpath("//input[@name='id']")).sendKeys(title);
					//16	Click find leads button
					driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
					Thread.sleep(3000);
					//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion 
					//18	Close the browser (Do not log out)
					driver.close();
	}

}
