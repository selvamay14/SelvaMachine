package wdMethods;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectMethods extends SeMethods {
	
	@BeforeMethod (groups= {"BM"})
	public void login()
	{
		//Navigate to leaftaps url
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
				
				
				//Click on 'CRM/SFA' link
				WebElement crm=locateElement("link", "CRM/SFA");
				click(crm);
				
			
	}
	
	@AfterMethod (groups= {"AM"})
	public void closeBr() {
		
		closeBrowser();
		
	}

}
