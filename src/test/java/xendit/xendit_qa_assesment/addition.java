package xendit.xendit_qa_assesment;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;


public class addition extends base{
	
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
	public void TC1()
	{
		additionClassObjects add = new additionClassObjects(driver);
		add.ADD1();
		
	}
	
	@Test(priority=3)
	public void TC1Compare() throws IOException
	{
		additionClassObjects add = new additionClassObjects(driver);
		add.ADD1cmp();
	}
	
	
	@Test(priority=4)
	public void TC2()
	{
		additionClassObjects add = new additionClassObjects(driver);
		add.ADD2();
	}
	
	
	@Test(priority=5)
	public void TC2Compare() throws IOException
	{
		additionClassObjects add = new additionClassObjects(driver);
		add.ADD2cmp();
	}
	
	@Test(priority=6)
	public void TC3()
	{
		additionClassObjects add = new additionClassObjects(driver);
		add.ADD3();
	}
	
	@Test(priority=7)
	public void TC3Compare() throws IOException
	{
		additionClassObjects add = new additionClassObjects(driver);
		add.ADD3cmp();
	}
	
	@Test(priority=8)
	public void TC4()
	{
		additionClassObjects add = new additionClassObjects(driver);
		add.ADD4();
	}
	
	@Test(priority=9)
	public void TC4Compare() throws IOException
	{
		additionClassObjects add = new additionClassObjects(driver);
		add.ADD4cmp();
	}
	
	@Test(priority=10)
	public void TC5()
	{
		additionClassObjects add = new additionClassObjects(driver);
		add.ADD5();
	}
	
	@Test(priority=11)
	public void TC5Compare() throws IOException
	{
		additionClassObjects add = new additionClassObjects(driver);
		add.ADD5cmp();
	}
	
	@AfterTest
	public void close() 
	{
		driver.close();
	}

}
