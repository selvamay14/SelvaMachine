package week01day01;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadDropdown {
	public static void main(String[] args) throws InterruptedException
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
	
	WebElement Elem = driver.findElementById("createLeadForm_dataSourceId");
	Select sel1 =new Select (Elem);
	sel1.selectByVisibleText("Employee");
	Thread.sleep(5000);
	
	Select sel2=new Select (driver.findElementById("createLeadForm_marketingCampaignId"));
	List<WebElement> TotalElement = sel2.getOptions();
	int length = TotalElement.size();
	
	
	for (WebElement printAll : TotalElement) {
		
		System.out.println(printAll.getText());
		
	}
	sel2.selectByIndex(length-2);	
	
	
	driver.findElementByName("submitButton").click();

	driver.close();
}
}