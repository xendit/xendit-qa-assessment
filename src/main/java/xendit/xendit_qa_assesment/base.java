package xendit.xendit_qa_assesment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public WebDriver driver;
	public Properties pro;

	public WebDriver initializeBrowser() throws IOException {

	pro = new Properties();
	FileInputStream fileName = new FileInputStream(
			System.getProperty("user.dir") + "\\src\\main\\java\\xendit\\xendit_qa_assesment\\data.properties\\");

	pro.load(fileName);
	String browserName = pro.getProperty("browser");
	System.out.println(browserName);

	if (browserName.equals("chrome")) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe\\");
		driver = new ChromeDriver();
	}

	else if (browserName.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\geckodriver.exe\\");
		driver = new FirefoxDriver();
	}

	else if (browserName.equals("Internet Explorer")) {
		System.setProperty("webdriver.i.e.driver", System.getProperty("user.dir") + "\\IEDriverServer.exe\\");
		driver = new InternetExplorerDriver();
	}
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	return driver;

}

public void ScreenshotPath(String testCaseName, WebDriver driver) throws IOException {
	WebElement e = driver.findElement(By.id("canvas"));
	TakesScreenshot abc = ((TakesScreenshot)e);
			File xyz = abc.getScreenshotAs(OutputType.FILE);
			String destinationFile = System.getProperty("user.dir")+"\\screenshot\\"+testCaseName+".png" ;
			FileUtils.copyFile(xyz, new File(destinationFile));
	
}
}
