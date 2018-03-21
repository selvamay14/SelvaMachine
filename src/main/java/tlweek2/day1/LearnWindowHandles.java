package tlweek2.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) throws InterruptedException {
	//load driver path
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		//launch browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//load url		
		driver.get("https://legacy.crystalcruises.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		Set<String> allWin = driver.getWindowHandles();
		for (String eachWin : allWin) {
			System.out.println(eachWin);
		}		
		List<String> list = new ArrayList<String>();
		list.addAll(allWin);
		driver.switchTo().window(list.get(1));
	
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElementByLinkText("View Offer�").click();
		
		Set<String> allWin1 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>();
		list1.addAll(allWin1);
		
		driver.switchTo().window(list1.get(2));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		if (!driver.getTitle().equals("	Cruise Specials | Cruise-Only Fares From $2,370")) {
			driver.quit();
		}
		
	
		
		
		
		
		
	}

}
