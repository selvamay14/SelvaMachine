package tlweek2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Maximize the browser
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//load the URL
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementByLinkText("Check Availability").click();
		Alert alert = driver.switchTo().alert();
		//String alertText = driver.switchTo().alert().getText();
		String alertText = alert.getText();
		System.out.println("Alert Txt is: "+alertText);
		//driver.switchTo().alert().accept();
		alert.sendKeys("abc");
		alert.accept();
		driver.findElementById("userRegistrationForm:password").sendKeys("abc");
		
	}
}
