package Task1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_and_NavigationFunction 
{

	public static void main(String[] args) {
		
		
		  // Set up ChromeDriver	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	 	  // Browser setup
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	      // Open Naukri login page
	driver.get("http://login.naukri.com");
	
	    // Perform login
	driver.findElement(By.id("usernameField")).sendKeys("neelaswapna94@gmail.com");
	driver.findElement(By.id("passwordField")).sendKeys("Swapna@123");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	
	      // Verify login success or not
	
	WebElement Opportunities = driver.findElement(By.xpath("//a/div[contains(text(),'Opportunities')]"));
	String actualValue = Opportunities.getText();
	
	//System.out.println(Opportunities.getText());
	
	String expectedValue = "Opportunities";
	
	if(actualValue .equals(expectedValue))
	{
		System.out.println("Login Successful");
	}
	else 
		System.out.println("Login Failed");
	
	
	
	// NAVIGATION FUNCTION

	driver.navigate().to("http://google.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().to("http://facebook.com");
	driver.navigate().back();
	driver.navigate().refresh();
	
	 // Close the browser
		 driver.quit();
	
	}
}

