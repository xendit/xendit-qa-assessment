package xendit.xendit_qa_assesment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class Listeners extends base implements ITestListener {
	
	ExtentReports extent = ExtentReport.getExtentReports();
	ExtentTest test;	
	
	@Override
	public void onTestStart(ITestResult result) {
		String testCaseName = result.getMethod().getMethodName();
	test = extent.createTest(testCaseName);
	}
	
	
	
	@Override
	public void onTestSuccess(ITestResult result) {
		

		String testCaseName = result.getMethod().getMethodName();
		
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e){
			e.printStackTrace();
		}
		
		try {
			ScreenshotPath(testCaseName,driver);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		

		String testCaseName = result.getMethod().getMethodName();
		
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e){
			e.printStackTrace();
		}
		
		try {
			ScreenshotPath(testCaseName,driver);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
			



}
