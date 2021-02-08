package xendit.xendit_qa_assesment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class division extends base {

	WebDriver driver;

	@Test(priority = 1)
	public void openOnlineCalculator() throws IOException {
		driver = initializeBrowser();
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();
		driver.switchTo().frame("fullframe");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test(priority = 2)
	public void TC9() {
		divisionClassObjects div = new divisionClassObjects(driver);
		div.DIV1();

	}

	@Test(priority = 3)
	public void TC9Compare() throws IOException {
		divisionClassObjects div = new divisionClassObjects(driver);
		div.DIV1cmp();
	}

	@Test(priority = 4)
	public void TC10() {
		divisionClassObjects div = new divisionClassObjects(driver);
		div.DIV2();
	}

	@Test(priority = 5)
	public void TC10Compare() throws IOException {
		divisionClassObjects div = new divisionClassObjects(driver);
		div.DIV2cmp();
	}

	@Test(priority = 6)
	public void TC11() {
		divisionClassObjects div = new divisionClassObjects(driver);
		div.DIV3();
	}

	@Test(priority = 7)
	public void TC11Compare() throws IOException {
		divisionClassObjects div = new divisionClassObjects(driver);
		div.DIV3cmp();
	}

	@Test(priority = 8)
	public void TC12() {
		divisionClassObjects div = new divisionClassObjects(driver);
		div.DIV4();
	}

	@Test(priority = 9)
	public void TC12Compare() throws IOException {
		divisionClassObjects div = new divisionClassObjects(driver);
		div.DIV4cmp();
	}

	@Test(priority = 10)
	public void TC13() {
		divisionClassObjects div = new divisionClassObjects(driver);
		div.DIV5();
	}

	@Test(priority = 11)
	public void TC13Compare() throws IOException {
		divisionClassObjects div = new divisionClassObjects(driver);
		div.DIV5cmp();
	}

	@AfterTest
	public void close() {
		driver.close();
	}

}
