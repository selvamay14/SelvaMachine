package tlleaf.Contact;

import org.junit.Test;

import wdMethods.ProjectMethods;

public class MergeContact extends ProjectMethods{
	
	@Test
	public void createContact() throws InterruptedException {		
		click(locateElement("linkText", "Contacts"));
		click(locateElement("linkText", "Merge Contacts"));
		
		click(locateElement("xpath", "(//img[@alt='Lookup'])[1]"));
		switchToWindow(1);
		type(locateElement("name", "firstName"), "Gopinath");
		click(locateElement("xpath", "//button[contains(text(),'Find Contacts')]"));
		Thread.sleep(2000);
		String sText= getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		clickWithoutSnap(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		switchToWindow(0);
		
		click(locateElement("xpath", "(//img[@alt='Lookup'])[2]"));
		switchToWindow(1);
		type(locateElement("name", "firstName"), "Babu");
		click(locateElement("xpath", "//button[contains(text(),'Find Contacts')]"));
		Thread.sleep(2000);		
		clickWithoutSnap(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		switchToWindow(0);
		
		clickWithoutSnap(locateElement("linkText", "Merge"));
		acceptAlert();
		
		click(locateElement("linkText", "Find Contacts"));
		type(locateElement("xpath", "//label[contains(text(),'Contact Id:')]/following::input[1]"), sText);
		click(locateElement("xpath", "//button[contains(text(),'Find Contacts')]"));
		Thread.sleep(2000);
		verifyPartialText(locateElement("xpath", "//div[@class='x-paging-info']"), "No records to display");		
	}

}
