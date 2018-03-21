package Week02day02;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class CreateLeadWIntMethods extends SeMethods {
	
	//Login into app
	@Test
	public void createLeadSeMethod() throws InterruptedException
	{
		
		//Navigate to leaftaps url
		startApp("chrome", "");
		
		//Enter user name
		WebElement userName = locateElement("username");
		type(userName, "DemoSalesManager");
	
		
		
		//Enter password
		WebElement password = locateElement("password");
		type(password, "crmsfa");
	
		
		//Click on login
		WebElement login = locateElement("class", "decorativeSubmit");
		click(login);
		
		
		//Click on 'CRM/SFA' link
		WebElement crm=locateElement("link", "CRM/SFA");
		click(crm);
		
		
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
		
	}
	
	

}
