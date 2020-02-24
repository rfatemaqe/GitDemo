package udemy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	@Test         
	public void Login()

	{

	// Declare what browser would you use, and where is that browsers driver located  
	System.setProperty("webdriver.chrome.driver", "C:\\autoB\\chromedriver.exe");
		

	//open the chrome browser and it is also means that driver is getting reffered as chrome browser.
	//making a connection with the driver and chrome
	
	//1st test step
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("alam.anft@gmail.com");
    driver.findElement(By.id("pass")).sendKeys("Hydration01");
    driver.findElement(By.id("loginbutton")).click();
	
	}	
	
}
