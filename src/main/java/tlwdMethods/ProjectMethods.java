package tlwdMethods;

public class ProjectMethods extends SeMethods{
	
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		type(locateElement("id", "username"), "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("className", "decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));
	}
	
	public void closeApp() {
		closeBrowser();
	}
	

}
