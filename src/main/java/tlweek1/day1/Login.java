package tlweek1.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	
	//@Test(invocationCount=2,threadPoolSize=2)
	//@Test(invocationCount=2,invocationTimeOut=10000)
	@Test(invocationCount=2,timeOut=15000)
	public void login() throws InterruptedException {
		//load driver path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		//launch browser
		ChromeDriver driver = new ChromeDriver();

		 	//maximize the browser
		driver.manage().window().maximize();
		//throw new RuntimeException();

		//load url
		driver.get("http://leaftaps.com/opentaps");
		//enter UserName
		driver.findElementById("username").sendKeys("DemoSalesManager",Keys.TAB);          
		//Thread.sleep(5000);
		//enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		//click login
		driver.findElementByClassName("decorativeSubmit").click();
		//click logout
		//driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_dataSourceId").sendKeys("Conference");

		// Take a snapshot
		// Specific WebElement or Web Page ?? 
		// When you take screen shot using print screen
			// Where is it stored? 
		// And then what you do?
			// Copy from there to your desired path
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
