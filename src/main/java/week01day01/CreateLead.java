package week01day01;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	//driver.findElementByClassName("decorativeSubmit").click();

	driver.findElementByLinkText("CRM/SFA").click();

	driver.findElementByLinkText("Create Lead").click();

	driver.findElementById("createLeadForm_companyName").sendKeys("CN001");
	driver.findElementById("createLeadForm_firstName").sendKeys("FN001");
	driver.findElementById("createLeadForm_lastName").sendKeys("LN001");
	driver.findElementByName("submitButton").click();

}
}
