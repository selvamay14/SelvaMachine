package week04day02;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class Cw1aCreateLeadProjMethods extends ProjectMethods {
	
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
	
	

}
