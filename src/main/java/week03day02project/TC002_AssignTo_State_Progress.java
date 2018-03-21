package week03day02project;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class TC002_AssignTo_State_Progress extends SeMethods {
	
	
	@Test
	public void assignToState() throws InterruptedException
	{
		
	//Step 1 - Load Login Page

		startApp("chrome", "https://dev28890.service-now.com/navpage.do");		
		WebElement frameValue=locateElement("id", "gsft_main");
		switchToFrame(frameValue);
		
	//Step 2 - Enter Username And Password
		WebElement un=locateElement("id","user_name");
		type(un,"admin");		
		WebElement up=locateElement("id","user_password");
		type(up, "Zeeja@12345");
		
	//Step 3 - Login And Load Home Page
		WebElement log=locateElement("id", "sysverb_login");
		click(log);
		
	//Step 4 - 	In Left Menu Enter Incident In Filter Navigator Search And Click On Assign To Me (Incident->Open – Unassigned
		
		//search incidents
		//waitExplicitly("xpath", "//input[@name='filter']");
		Thread.sleep(3000);
		WebElement searchInc=locateElement("xpath", "//input[@name='filter']");
		typeWithEnterKey(searchInc, "Incidents");
		
		Thread.sleep(3000);		
		WebElement clickInc=locateElement("xpath","(//div[text()='Incidents'])[1]");
		click(clickInc);
		
//		waitExplicitly("xpath", "//input[@class='form-control']")
		//Thread.sleep(5000);
		
		//gsft_main
		WebElement frameValue2=locateElement("id", "gsft_main");
		switchToFrame(frameValue2);
		WebElement enterInc=locateElement("xpath", "(//input[@class='form-control'])[1]");
	//	click(enterInc);
		typeWithEnterKey(enterInc,"INC0010001");
		
		
// step 5 - Enter The New Incident Number That You Created, In Search Field  And Click First Result Match
		Thread.sleep(5000);
		WebElement result=locateElement("link","INC0010001");
		click(result);
		
// step6 - Change States field to “in-progress” Assign To Field  Click And Select By Down Arrow ‘Itil User’
		Thread.sleep(5000);
	//	WebElement frameValue3=locateElement("id", "gsft_main");
	//	switchToFrame(frameValue3);
		
		WebElement typeDp=locateElement("xpath","(//div[@class='col-xs-10 col-sm-9 col-md-6 col-lg-5 form-field input_controls'])[7]/select");
		selectDropDownUsingText(typeDp, "In Progress");
		
// step7 Click The Update Button And Click ‘Open’ In Left Menu
		WebElement updateBtn=locateElement("xpath","(//button[@class='form_action_button header  action_context btn btn-default'])[1]");
		click(updateBtn);
	
// step 8 Enter The Incident Number And Verify states field and Assign To Field In First Result
		WebElement actResult=locateElement("xpath","//td[text()='In Progress']");
		String expResult="In Progress";
		if (actResult.equals(actResult))
		{
			System.out.println("Actural Result is " +actResult+" matched with expected Result " +expResult);
		}else
		{
			System.out.println("Actual Result is NOT  " +actResult+" matched with expected Result " +expResult);
		}
	
	}
	
	

}
