package week04day02CW02;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportGenerate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reporter/result.html");
		html.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		
		ExtentTest test = extent.createTest("TC001_Createlead","Create a new leads in leads");
		test.assignAuthor("Selva2");
		test.assignCategory("Smoke");
		test.pass("The Demo sales Manager is entered Successfully", MediaEntityBuilder.createScreenCaptureFromBase64String("C:/Selenium/SelFeb2018/snaps/test.jpg").build());
		test.pass("The Data crnsfa entered successfully");
		test.pass("Logged in Successfully");
		extent.flush();
		
		
		
	}

}
