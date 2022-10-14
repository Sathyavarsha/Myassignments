package week2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundInputxhtml {

	public static void main(String[] args) {
					// Launch the browser
					WebDriverManager.chromedriver().setup();				
					ChromeDriver driver=new ChromeDriver();	
					// https://www.leafground.com/input.xhtml
					driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");		
					// Maximise the window
					driver.manage().window().maximize();		
					// Add implicit wait
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					// Type your name
					driver.findElement(By.xpath("//input[@name='j_idt88:name']")).sendKeys("Sathya");
					// Append Country to this City.
					driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).clear();
					driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys("India");
					// Verify if text box is disabled
					System.out.println(driver.findElement(By.xpath("//input[contains(@class,'ui-state-disabled')]")).isEnabled());
					//Clear the typed text
					driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();
					//Retrieve the typed text.
					System.out.println(driver.findElement(By.name("j_idt88:j_idt97")).getAttribute("value"));
					//Type email and Tab. Confirm control moved to next element.
					driver.findElement(By.name("j_idt88:j_idt99")).sendKeys("sathya.r593@gmail.com",Keys.TAB);
					//Type about yourself
					driver.findElement(By.name("j_idt88:j_idt101")).sendKeys("I am sathya");
					//Text Editor
					driver.findElement(By.xpath("(//button[@class='ql-bold'])[1]")).click();
					driver.findElement(By.xpath("(//button[@class='ql-list'])[1]")).click();
					
	}

}
