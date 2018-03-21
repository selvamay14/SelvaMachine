package tlweek1.day1;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException, IOException {
	//load driver path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		//launch browser
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		//load url
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//WebElement securityQ = driver.findElementById("userRegistrationForm:securityQ");

		Select dd = new Select(
		driver.findElementById("userRegistrationForm:securityQ"));
		dd.selectByVisibleText("What is your fathers middle name?");

		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img.png");
		FileUtils.copyFile(src, desc);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*dd.selectByIndex(2);
		Thread.sleep(3000);
		dd.selectByValue("4");
		Thread.sleep(3000);
		*/
		List<WebElement> allOptions = dd.getOptions();
		String text2 = allOptions.get(2).getText();
		int count = allOptions.size();
		System.out.println(count);
		dd.selectByIndex(count-1);
		for (WebElement eachOption : allOptions) {
			String text = eachOption.getText();
			System.out.println(text);
		}				
	}
}
