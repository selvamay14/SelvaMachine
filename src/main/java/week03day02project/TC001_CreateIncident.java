package week03day02project;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class TC001_CreateIncident extends SeMethods {
	@Test 
	public void createIncidentWithSe() throws InterruptedException {
		
		//Step 1: Load Login Page
		startApp ("Chrome","https://dev28890.service-now.com/nav_to.do");
		Thread.sleep(3000);
		
		WebElement frame1=locateElement("id","gsft_main");
		switchToFrame(frame1);
		
		//Step 2: Enter Username And Password
		WebElement un=locateElement("id","user_name");
		type(un,"admin");
		WebElement up=locateElement("id","user_password");
		type(up,"Zeeja@12345");
		
		//Step 3: Login to Home Page
		 WebElement sl=locateElement("id","sysverb_login");
		click(sl);
		Thread.sleep(3000);
		
	    //Step 4: In Left Menu Enter Incident In Filter Navigator Search And Click On Create New (Incident->Incidents->Create New
		WebElement filter= locateElement("xpath","//input[@id='filter']");
		typeWithEnterKey(filter,"incidents");
		Thread.sleep(3000);
		
		//Step5 :Capture The  Number And Store For Future Uses	
		
	}


}
