package xendit.xendit_qa_assesment;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class additionClassObjects {

	public WebDriver driver;

	public additionClassObjects(WebDriver driver) {
		this.driver = driver;

	}

	public void ADD1() {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("canvas")), 0, 120).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 100, 220).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 0, -60).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 175, 220).click().build().perform();
	}

	public void ADD1cmp() throws IOException {
		BufferedImage im = ImageIO
				.read(new File(System.getProperty("user.dir") + "\\original-SS\\" + "expected-TC1.png"));
		BufferedImage im2 = ImageIO
				.read(new File(System.getProperty("user.dir") + "\\screenshot\\" + "TC1.png"));
		ImageDiffer IMGDIF = new ImageDiffer();
		ImageDiff diff = IMGDIF.makeDiff(im, im2);

		Assert.assertFalse(diff.hasDiff(), "Images not same");
	}
	
	public void ADD2() {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("canvas")), 175, -120).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 100, 120).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 0, 120).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 100, 220).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 100, 120).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 0, -60).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 175, 220).click().build().perform();
	}

	public void ADD2cmp() throws IOException {
		BufferedImage im = ImageIO
				.read(new File(System.getProperty("user.dir") + "\\original-SS\\" + "expected-TC2.png"));
		BufferedImage im2 = ImageIO
				.read(new File(System.getProperty("user.dir") + "\\screenshot\\" + "TC2.png"));
		ImageDiffer IMGDIF = new ImageDiffer();
		ImageDiff diff = IMGDIF.makeDiff(im, im2);

		Assert.assertFalse(diff.hasDiff(), "Images not same");
	}
	
	
	public void ADD3() {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("canvas")), 175, -120).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 100, 120).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 0, 120).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 100, 220).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 0, -60).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 175, 220).click().build().perform();
	}

	public void ADD3cmp() throws IOException {
		BufferedImage im = ImageIO
				.read(new File(System.getProperty("user.dir") + "\\original-SS\\" + "expected-TC3.png"));
		BufferedImage im2 = ImageIO
				.read(new File(System.getProperty("user.dir") + "\\screenshot\\" + "TC3.png"));
		ImageDiffer IMGDIF = new ImageDiffer();
		ImageDiff diff = IMGDIF.makeDiff(im, im2);

		Assert.assertFalse(diff.hasDiff(), "Images not same");
	}
	
	
	
	public void ADD4() {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("canvas")), 175, -120).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 0, 120).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 100, 220).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 100, 120).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 0, -60).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 175, 220).click().build().perform();}

	public void ADD4cmp() throws IOException {
		BufferedImage im = ImageIO
				.read(new File(System.getProperty("user.dir") + "\\original-SS\\" + "expected-TC4.png"));
		BufferedImage im2 = ImageIO
				.read(new File(System.getProperty("user.dir") + "\\screenshot\\" + "TC4.png"));
		ImageDiffer IMGDIF = new ImageDiffer();
		ImageDiff diff = IMGDIF.makeDiff(im, im2);

		Assert.assertFalse(diff.hasDiff(), "Images not same");
	}
	
	public void ADD5() {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("canvas")), 175, -120).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 0, 120).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 100, 220).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), -175, 220).click().build().perform();
		a.moveToElement(driver.findElement(By.id("canvas")), 175, 220).click().build().perform();}

	public void ADD5cmp() throws IOException {
		BufferedImage im = ImageIO
				.read(new File(System.getProperty("user.dir") + "\\original-SS\\" + "expected-TC5.png"));
		BufferedImage im2 = ImageIO
				.read(new File(System.getProperty("user.dir") + "\\screenshot\\" + "TC5.png"));
		ImageDiffer IMGDIF = new ImageDiffer();
		ImageDiff diff = IMGDIF.makeDiff(im, im2);

		Assert.assertFalse(diff.hasDiff(), "Images not same");
	}
}
