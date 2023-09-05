package week9.Classworks.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC001_CreateAccount {

	public static void main(String[] args) {
		        //set up browser	
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
			    //Click on New button
			    driver.findElement(By.xpath("//div[text()='New']")).click();
			    //Enter 'your name' as account name
			    WebElement accountname = driver.findElement(By.xpath("//input[@name='Name']"));
			    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", accountname);
			    accountname.sendKeys("Balaji Saravanan");
			   
			    //Select Ownership as Public   
			   // driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[3]")).click();
			   
			   //Click save and verify Account name 
			    driver.findElement(By.xpath("//button[text()='Save']")).click();
			    
			    //Click save and verify Account name 
			    WebElement toastmessage = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
			    toastmessage.getText();
			    System.out.println("Account Creation Status:  "+toastmessage);
			    
			    //closing the browser
		        driver.close();

	}

}
