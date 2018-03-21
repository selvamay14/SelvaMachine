package Week02day02;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class MergeLeadWintMethods extends SeMethods{

	@Test
	public void mergeLeads() {
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
		
		//merging the leads
		click(locateElement("xpath","//a[text()='Leads']"));
		click(locateElement("link","Merge Leads"));
		
		//finding the first lead using id
		click(locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[1]"));
		switchToWindow(1);
		type(locateElement("xpath","(//div[@class='x-form-element'])[1]/input"),"10345");
		click(locateElement("xpath","//button[text()='Find Leads']"));
		waitExplicitly("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a");
		clickWithoutSnap(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a"));
		switchToWindow(0);
		
		//Finding the second lead using id
		click(locateElement("xpath","(//img[@src='/images/fieldlookup.gif'])[2]"));
		switchToWindow(1);
		type(locateElement("xpath","(//div[@class='x-form-element'])[1]/input"),"10342");
		click(locateElement("xpath","//button[text()='Find Leads']"));
		waitExplicitly("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a");
		clickWithoutSnap(locateElement("xpath","(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a"));
		switchToWindow(0);
		
		//Merging two leads
		clickWithoutSnap(locateElement("link","Merge"));
		acceptAlert();
		click(locateElement("link","Find Leads"));
		type(locateElement("xpath","(//div[@class='x-form-item x-tab-item'])[1]//input"),"11242");
		click(locateElement("xpath","//button[text()='Find Leads']"));
		
		//verifying whether leads have been merged or not
		if(locateElement("xpath","//div[text()='No records to display']").isDisplayed())
		{
			System.out.println("Merged Successfully");
		}
		else
		{
			System.out.println("Lead ids are not merged");
		}
		
	}

}
