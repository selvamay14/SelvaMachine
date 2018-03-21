package Week02day02;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class EditLeadWIntMethods extends SeMethods {
	
	@Test
	public void editLeadWithSEMethod()
	{
		
		String nameVar="FN001AslamU";
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
		
		//Click on leads
		WebElement linkLeads=locateElement("link", "Leads");
		click(linkLeads);
		
		//Finding the lead by first name
		click(locateElement("xpath","//a[text()='Find Leads']"));
		type(locateElement("xpath", "(//div[@class='x-form-item x-tab-item'])[2]//input"), "FN001Aslam");
		click(locateElement("xpath","//button[text()='Find Leads']"));
		
		//selecting the first result
		waitExplicitly("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]");
		click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
		
		//Editing the first name
		verifyDisplayed(locateElement("xpath","//a[text()='Edit']"));
		click(locateElement("xpath","//a[text()='Edit']"));
		type(locateElement("xpath","//input[@id='updateLeadForm_firstName']"), nameVar);
		click(locateElement("xpath","//input[@value='Update']"));
		verifyExactText(locateElement("viewLead_firstName_sp"), nameVar);
		
		// checking whether leadid is updated with the new name or not
		if(locateElement("viewLead_firstName_sp").getText().equals(nameVar))
		{
			System.out.println("First name is successfully updated as "+ nameVar);
		}
		else
		{
			System.out.println("First name is not updated");
		}
		

		//Click on Findleads
		WebElement linkFindLeads=locateElement("link", "Find Leads");
		click(linkFindLeads);
		
		
//		//Enter value in Lead ID
//		WebElement xpLeadID=locateElement("xpath", "//input[@name='id']");
//		type(xpLeadID,"10287");
//		
//		//Click on FindLeads
//		WebElement xpFindLeads=locateElement("xpath", "//button[contains(text(),'Find Leads')]");
//		click(xpFindLeads);
//		
//		//Select the first result
//		waitExplicitly("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]");
//		click(locateElement("xpath","//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]"));
//		
		
		
	}

}
