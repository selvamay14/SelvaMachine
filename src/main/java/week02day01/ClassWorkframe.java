package week02day01;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWorkframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		WebDriver frametxt = driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button [text()='Try it']").click();	  
		Alert pmtAlert = driver.switchTo().alert();
		String abc="sheikalim";
		
		pmtAlert.sendKeys(abc);
		pmtAlert.accept();
		
		String result = driver.findElementByXPath("//p [contains(text(),'sheikalim')]").getText();
		System.out.println(result);
		//String result = frametxt.getText();
		
		if (result.contains(abc))
		{
			System.out.println("Text is present ");
		}
		else
			System.out.println("Text is NOT present");
		
		
		
	}

}
