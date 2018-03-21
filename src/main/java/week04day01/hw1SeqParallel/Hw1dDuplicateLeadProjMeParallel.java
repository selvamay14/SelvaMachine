package week04day01.hw1SeqParallel;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class Hw1dDuplicateLeadProjMeParallel extends ProjectMethods{

	@Test
	public void duplicateLeads() {
		
		login();

		/*//Navigate to Leaftabs url
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
		//Finding the lead by first name
		click(locateElement("xpath","//a[text()='Leads']"));
		click(locateElement("xpath","//a[text()='Find Leads']"));
		type(locateElement("xpath", "(//div[@class='x-form-item x-tab-item'])[2]//input"), "FN001Aslam");
		click(locateElement("xpath","//button[text()='Find Leads']"));
		
		//selecting the first result
		waitExplicitly("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		click(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		
		//Clicking on duplicate lead
		click(locateElement("link","Duplicate Lead"));
		click(locateElement("xpath","//input[@value='Create Lead']"));
		
		
		
	}

}
