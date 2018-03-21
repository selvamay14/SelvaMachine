package week04day01.hw2DependOnCom;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class Hw2aDelEditDepCre extends ProjectMethods {
	
	//Login into app
	@Test
	public void createLeadSeMethod() throws InterruptedException
	{
		
	
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
	
	@Test (dependsOnMethods="week04day01.hw2DependOnCom.Hw2aDelEditDepCre.createLeadSeMethod")
	public void editLeadWithSEMethod()
	{
		
		String nameVar="FN001AslamU";
		login();
		
		
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
	
	@Test
//	(dependsOnMethods="week04day01.hw2DependOnCom.Hw2aDelEditDepCre.createLeadSeMethod()")
	public void deleteLeads() {
		login();
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
