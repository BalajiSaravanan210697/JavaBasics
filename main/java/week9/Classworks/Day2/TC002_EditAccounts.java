package week9.Classworks.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC002_EditAccounts {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//Global time wait to handle all slowness over application
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//launch the URL
		driver.get("https://login.salesforce.com");

		//user name entered using id locator
	    driver.findElement(By.id("username")).sendKeys("balajisara1997@gmail.com");
	    //password entered using id locator
	    driver.findElement(By.id("password")).sendKeys("Balaji@008");
	    //Login clicked using id locator
	    driver.findElement(By.id("Login")).click();
	    
	    // toggle menu clicked based on the class name
	    driver.findElement(By.className("slds-icon-waffle")).click();
	    //clicking the view All button from the drop down
	    driver.findElement(By.xpath("//button[text()='View All']")).click();
	    //click Sales from App Launcher using text 
	    driver.findElement(By.xpath("//p[text()='Sales']")).click();
	    //Click on Accounts tab 
	    WebElement account = driver.findElement(By.xpath("//span[text()='Accounts']"));
	    driver.executeScript("arguments[0].click();", account);
	    //Search for the Account Using the unique account name created by you
	    driver.findElement(By.xpath("//input[@name='Account-search-input']")).sendKeys("Balaji Saravanan");
	    //Click on the displayed Account Dropdown icon and select Edit
	    driver.findElement(By.xpath("//a[@title='Show 3 more actions']")).click();
	    driver.findElement(By.xpath("//div[@title='Edit']")).click();
	    
	    //closing the browser
        driver.close();

	}

}
