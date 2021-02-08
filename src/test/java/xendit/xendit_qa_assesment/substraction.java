package xendit.xendit_qa_assesment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class substraction extends base {
	
WebDriver driver;
	

	@Test(priority=1)
	public void openOnlineCalculator() throws IOException
	{
		driver = initializeBrowser();
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();
		driver.switchTo().frame("fullframe");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test(priority=2)
	public void TC6()
	{
		substractionClassObjects sub = new substractionClassObjects(driver);
		sub.SUB1();
		
	}
	
	@Test(priority=3)
	public void TC6Compare() throws IOException
	{
		substractionClassObjects sub = new substractionClassObjects(driver);
		sub.SUB1cmp();
	}
	
	
	@Test(priority=4)
	public void TC7()
	{
		substractionClassObjects sub = new substractionClassObjects(driver);
		sub.SUB2();
	}
	
	
	@Test(priority=5)
	public void TC7Compare() throws IOException
	{
		substractionClassObjects sub = new substractionClassObjects(driver);
		sub.SUB2cmp();
	}
	
	@Test(priority=6)
	public void TC8()
	{
		substractionClassObjects sub = new substractionClassObjects(driver);
		sub.SUB3();
	}
	
	@Test(priority=7)
	public void TC8Compare() throws IOException
	{
		substractionClassObjects sub = new substractionClassObjects(driver);
		sub.SUB3cmp();
	}
	
	
	@AfterTest
	public void close() 
	{
		driver.close();
	}


}
