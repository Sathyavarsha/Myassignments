package week2Assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
//Step 1: Download and set the path 
public class FaceBook {

	public static void main(String[] args) {
		// Step 2: Launch the chromebrowser
		WebDriverManager.chromedriver().setup();				
		ChromeDriver driver=new ChromeDriver();	
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");		
		// Step 4: Maximise the window
		driver.manage().window().maximize();		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Step 6: Click on Create New Account button
		driver.findElement(By.linkText("Create New Account")).click();
		// Step 7: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("sathyavarsha");	
		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("R");		
		// Step 9: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("8015350921");
		// Step 10: Enterthe password
		driver.findElement(By.name("reg_passwd__")).sendKeys("sathya123");			
		// Step 11: Handle all the three drop downs
	    WebElement Day = driver.findElement(By.id("day"));
	    Select op=new Select(Day);
	    op.selectByValue("5");	    
	    WebElement Month = driver.findElement(By.id("month"));
	    Select value=new Select(Month);
	    value.selectByIndex(5);	   	    
	    WebElement Year = driver.findElement(By.id("year"));
	    Select value1=new Select(Year);
	    value1.selectByVisibleText("1993");	    
        // Step 12: Select the radio button "Female" 
	    driver.findElement(By.xpath("//label[text()='Female']")).click();
		
	}

}
