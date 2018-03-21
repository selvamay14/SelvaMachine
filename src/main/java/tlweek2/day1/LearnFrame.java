package tlweek2.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
	//load driver path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		//launch browser - Headless
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		ChromeDriver driver = new ChromeDriver(options);
		
		
		//maximize the browser
		driver.manage().window().maximize();
		//load url		
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		String text = driver.findElementById("draggable").getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Download").click();
		driver.switchTo().parentFrame();
		
		
		
		
		
		
		
	
		
		
		
		
		
	}

}
