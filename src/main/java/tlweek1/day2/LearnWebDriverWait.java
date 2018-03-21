package tlweek1.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebDriverWait {
	public static void main(String[] args) throws InterruptedException {
		
/*	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElementByXPath("//button[@class='_2AkmmA _29YdH8']").click();
		Actions builder = new Actions(driver);
		WebElement elec = driver.findElementByXPath("//span[text()='Electronics']");
		WebElement app = driver.findElementByXPath("//span[text()='Apple']");
		builder.moveToElement(elec).perform();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(app));
		builder.click(app).perform();*/
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[2]").sendKeys("abc");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		//Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));
	driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
	}

}









/*WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")));
		//wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//div[text()='One Moment...']"), "One Moment..."));*/