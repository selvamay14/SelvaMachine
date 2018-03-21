package Week02day02;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class DeleteLeadWintMethods extends SeMethods{

	@Test
	public void findLeads() {

		//Navigate to Leaftabs url
		startApp("chrome","http://leaftaps.com/opentaps");
		
		//Enter username
		WebElement un=locateElement("id","username");
		type(un,"DemoSalesManager");
		
		//Enter password
		WebElement pass = locateElement("id","password");
		type(pass,"crmsfa");
		
		//Click login
		WebElement login=locateElement("class", "decorativeSubmit");
		click(login);
		
		//Click CRM/SFA link text
		WebElement linkCRMSFA=locateElement("link","CRM/SFA");
		click(linkCRMSFA);
		
		//Finding the lead by first name
		click(locateElement("xpath","//a[text()='Leads']"));
		click(locateElement("xpath","//a[text()='Find Leads']"));
		type(locateElement("xpath", "(//div[@class='x-form-item x-tab-item'])[2]//input"), "FN001Aslam");
		click(locateElement("xpath","//button[text()='Find Leads']"));
		
		//selecting the first result
		waitExplicitly("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		String leadid = locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").getText();
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		
		//deleting the first result
		click(locateElement("link","Delete"));
		
		//verifying whether the lead has been deleted or not
		click(locateElement("xpath","//a[text()='Find Leads']"));
		type(locateElement("xpath", "(//div[@class='x-form-item x-tab-item'])[2]//input"), leadid);
		click(locateElement("xpath","//button[text()='Find Leads']"));
		if(locateElement("xpath","//div[text()='No records to display']").isDisplayed())
		{
			System.out.println("leadid, " +leadid + " has been deleted successfully");
		}
		else
		{
			System.out.println(leadid+ " still exits");
		}

	}

}
