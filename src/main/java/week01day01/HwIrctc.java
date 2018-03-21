package week01day01;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HwIrctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Set driver path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//open chrome browser
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();

		
		//Navigate to IRCTC signup url
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		//driver.manage().window().maximize();
		
		//Enter valid data in all the fields except Captcha and submit
		driver.findElementById("userRegistrationForm:userName").sendKeys("TlLUid001");
		driver.findElementById("userRegistrationForm:password").sendKeys("TlPass01");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("TlPass01");
		
		WebElement elementQuestions = driver.findElementById("userRegistrationForm:securityQ");
		Select ddQuestions = new Select(elementQuestions);
		ddQuestions.selectByVisibleText("Who was your Childhood hero?");
		
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Vijay");
		
		WebElement elementLang  = driver.findElementById("userRegistrationForm:prelan");
		Select ddLang= new Select(elementLang);
		ddLang.selectByValue("en");
		
		driver.findElementById("userRegistrationForm:firstName").sendKeys("TlUn001");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("TlMn001");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("TlLn001");
		
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		
		WebElement elementDay = driver.findElementById("userRegistrationForm:dobDay");
		Select ddDay = new Select(elementDay);
		ddDay.selectByVisibleText("17");
		
		WebElement elementMonth = driver.findElementById("userRegistrationForm:dobMonth");
		Select ddMonth = new Select(elementMonth);
		ddMonth.selectByVisibleText("FEB");
		
		WebElement elementYear = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select ddYear = new Select(elementYear);
		ddYear.selectByVisibleText("1987");
		
		WebElement elementOccupation = driver.findElementById("userRegistrationForm:occupation");
		Select ddOccupation = new Select(elementOccupation);
		ddOccupation.selectByVisibleText("Private");
		
		driver.findElementById("userRegistrationForm:uidno").sendKeys("100020003000");
		driver.findElementById("userRegistrationForm:idno").sendKeys("AIOOX1552");
		
		WebElement elementCountry= driver.findElementById("userRegistrationForm:countries");
		Select ddCountry = new Select(elementCountry);
		ddCountry.selectByVisibleText("India");
		
		driver.findElementById("userRegistrationForm:email").sendKeys("asftest@gmail.com");
	//driver.findElementById("userRegistrationForm:isdCode").sendKeys("91",Keys.TAB);
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9061512500");

		WebElement elementNationality= driver.findElementById("userRegistrationForm:nationalityId");
		Select ddNationality = new Select(elementNationality);
		ddNationality.selectByVisibleText("India");
		
		driver.findElementById("userRegistrationForm:address").sendKeys("no 5/8");
		driver.findElementById("userRegistrationForm:street").sendKeys("KKK Nagar, 4th street");
		driver.findElementById("userRegistrationForm:area").sendKeys("AnnaNagar");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600118", Keys.TAB);
		
		Thread.sleep(5000);

		WebElement elementCity= driver.findElementById("userRegistrationForm:cityName");
		Select ddCity = new Select(elementCity);
		ddCity.selectByVisibleText("Chennai");
		
		Thread.sleep(5000);
		
		
		
		WebElement elementPostOff= driver.findElementById("userRegistrationForm:postofficeName");
		Select ddPostOff = new Select(elementPostOff);
		ddPostOff.selectByVisibleText("Kodungaiyur S.O");
		
		Thread.sleep(5000);

		
		driver.findElementById("userRegistrationForm:landline").sendKeys("9500015000");
		
		driver.findElementById("userRegistrationForm:resAndOff:0").click();

			
		
	}

}
