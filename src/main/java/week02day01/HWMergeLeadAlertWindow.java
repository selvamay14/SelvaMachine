//PARTIALLY COMPLETED

package week02day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HWMergeLeadAlertWindow {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	//Launch the browser
	ChromeDriver driver = new ChromeDriver();
	
	//Navigate to url
	driver.get("http://leaftaps.com/opentaps/");
	
	//Maximize the screen
	driver.manage().window().maximize();
	
	//Enter the username
	driver.findElementById("username").sendKeys("DemoSalesManager");
	
	//Enter the password
	driver.findElementById("password").sendKeys("crmsfa");
	
	//Click Login
	driver.findElementByClassName("decorativeSubmit").click();
	
	System.out.println("User logs successfully");

	//Click crm/sfa link
	driver.findElementByLinkText("CRM/SFA").click();

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//Click Leads link
	driver.findElementByXPath("(//div[@class='x-panel-header'])[2]").click();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	//Click Merge leads
	driver.findElementByXPath("//ul[@class='shortcuts']/li[4]").click();
	
	
	
	
	//Click on Icon near From Lead
	driver.findElementByXPath("//input[@name='partyIdFrom']/following::a[1]/img").click();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
//	Move to new window
	Set<String> allWindow=driver.getWindowHandles();
	List<String> listW=new ArrayList<String>();
	listW.addAll(allWindow);
	driver.switchTo().window(listW.get(1));
	driver.manage().window().maximize();
	System.out.println("Merge popup opens successfully");
//	Enter Lead ID
	driver.findElementByXPath("//div[@class='x-form-element']/input[1]").sendKeys("10033");
	
//	Click Find Leads button
	driver.findElementByXPath("//button[@class='x-btn-text']").click();
	
	System.out.println("Find Leads result displays succcessfully");
	
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='linktext'])[1]")));
	
//	Click First Resulting lead
	//driver.findElementByXPath("//table[@class='x-grid3-row-table']/following::a[1]").click();
	driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
//	Switch back to primary window
	driver.switchTo().window(listW.get(0));
	
	//Click on Icon near To Lead
	driver.findElementByXPath("//input[@name='partyIdFrom']/following::a[1]/img").click();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
//	Move to new window
	Set<String> allWindow2=driver.getWindowHandles();
	List<String> listW2=new ArrayList<String>();
	listW.addAll(allWindow2);
	driver.switchTo().window(listW2.get(1));
	driver.manage().window().maximize();
	System.out.println("Merge popup opens successfully");
//	Enter Lead ID
	driver.findElementByXPath("//div[@class='x-form-element']/input[1]").sendKeys("10033");
	
//	Click Find Leads button
	driver.findElementByXPath("//button[@class='x-btn-text']").click();
	
	System.out.println("Find Leads result displays succcessfully");
	
	WebDriverWait wait2 = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='linktext'])[1]")));
	
//	Click First Resulting lead
	//driver.findElementByXPath("//table[@class='x-grid3-row-table']/following::a[1]").click();
	driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
//	Switch back to primary window
	driver.switchTo().window(listW.get(0));
	
	
	
	
	
	
	
//	Click on Icon near To Lead
//	Move to new window
//	Enter Lead ID
//	Click Find Leads button
//	Click First Resulting lead
//	Switch back to primary window

//	Click Merge
//	Accept Alert
//	Click Find Leads
//	Enter From Lead ID
//	Click Find Leads
//	Verify error msg(no records to display)
//	Close the browser (Do not log out)


}
}