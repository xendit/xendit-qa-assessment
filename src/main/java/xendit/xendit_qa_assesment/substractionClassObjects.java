package xendit.xendit_qa_assesment;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class substractionClassObjects {
	
	WebDriver driver;
	
	
	public substractionClassObjects(WebDriver driver) {
		this.driver = driver;

	}

	public void SUB1() {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("canvas")), 0, -60).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 100, 120).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 0, 120).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 175, 220).click().build().perform();
	}

	public void SUB1cmp() throws IOException {
		BufferedImage im = ImageIO
				.read(new File(System.getProperty("user.dir") + "\\original-SS\\" + "expected-TC6.png"));
		BufferedImage im2 = ImageIO
				.read(new File(System.getProperty("user.dir") + "\\screenshot\\" + "TC6.png"));
		ImageDiffer IMGDIF = new ImageDiffer();
		ImageDiff diff = IMGDIF.makeDiff(im, im2);

		Assert.assertFalse(diff.hasDiff(), "Images not same");
	}
	
	public void SUB2() {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("canvas")), 175, -120).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 100, 120).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 0, 120).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 100, 120).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 0, -60).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 175, 220).click().build().perform();
	}

	public void SUB2cmp() throws IOException {
		BufferedImage im = ImageIO
				.read(new File(System.getProperty("user.dir") + "\\original-SS\\" + "expected-TC7.png"));
		BufferedImage im2 = ImageIO
				.read(new File(System.getProperty("user.dir") + "\\screenshot\\" + "TC7.png"));
		ImageDiffer IMGDIF = new ImageDiffer();
		ImageDiff diff = IMGDIF.makeDiff(im, im2);

		Assert.assertFalse(diff.hasDiff(), "Images not same");
	}
	
	
	public void SUB3() {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("canvas")), 175, -120).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 0, 120).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 100, 120).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 0, -60).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 175, 220).click().build().perform();
	}

	public void SUB3cmp() throws IOException {
		BufferedImage im = ImageIO
				.read(new File(System.getProperty("user.dir") + "\\original-SS\\" + "expected-TC8.png"));
		BufferedImage im2 = ImageIO
				.read(new File(System.getProperty("user.dir") + "\\screenshot\\" + "TC8.png"));
		ImageDiffer IMGDIF = new ImageDiffer();
		ImageDiff diff = IMGDIF.makeDiff(im, im2);

		Assert.assertFalse(diff.hasDiff(), "Images not same");
	}
	
	
	
	

}
