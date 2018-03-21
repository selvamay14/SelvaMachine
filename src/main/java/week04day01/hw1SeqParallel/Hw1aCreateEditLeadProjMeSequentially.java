package week04day01.hw1SeqParallel;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class Hw1aCreateEditLeadProjMeSequentially extends ProjectMethods {
	
	//Login into app
	@Test (priority=1)
	public void createLeadSeMethod() throws InterruptedException
	{
		
		login();
	/*	//Navigate to leaftaps url
		startApp("chrome", "http://leaftaps.com/opentaps");
		
		//Enter user name
		WebElement userName = locateElement("username");
		type(userName, "DemoSalesManager");
	
		
		
		//Enter password
		WebElement password = locateElement("password");
		type(password, "crmsfa");
	
		
		//Click on login
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
		
	*/	
		//Click on 'CRM/SFA' link
/*		WebElement crm=locateElement("link", "CRM/SFA");
		click(crm);
*/		
		
		//Click on Create Lead
		WebElement cl=locateElement("link", "Create Lead");
		click(cl);
		
		
		//Enter companyname
		WebElement cn=locateElement("id","createLeadForm_companyName");
		type(cn,"CN001");
		
		
		//Enter fastname
		WebElement fn=locateElement("id","createLeadForm_firstName");
		type(fn, "FN001Aslam");
		
		
		//Enter lastname
		WebElement ln=locateElement("id","createLeadForm_lastName");
		type(ln, "LN001");
		
		
		//Select Sources
		WebElement dp=locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingText(dp, "Employee");
		
		
		Thread.sleep(5000);
		
		//Click on Submit
		WebElement submit=locateElement("name", "submitButton");
		click(submit);
		
	//	closeBr();
		
		
	}
	
	@Test (priority=2)
	public void editLeadWithSEMethod()
	{
		
		String nameVar="FN001AslamU";
		login();
		
		
/*		//Navigate to Leaftabs url
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
*/		
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
	}
	
	

}
