package week01day02;

import org.openqa.selenium.chrome.ChromeDriver;

public class TlxpathEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
        
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("an");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		Thread.sleep(4000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();
	    driver.findElementByXPath("(//div[@class='frameSectionExtra']//a)[3]").click();
	    driver.findElementByXPath("(//input[@name='firstName'])[3]").clear();
	    driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("ChandarChange");
	    driver.findElementByXPath("//input[@class='smallSubmit']").click();
	    
	}

}
