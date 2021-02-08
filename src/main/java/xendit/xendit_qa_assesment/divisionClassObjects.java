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

public class divisionClassObjects {

	WebDriver driver;

	public divisionClassObjects(WebDriver driver) {
		this.driver = driver;

	}

	public void DIV1() {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("canvas")), 0, -60).click().build().perform(); // 9
		a.moveToElement(driver.findElement(By.id("canvas")), 100, -60).click().build().perform(); // %
		a.moveToElement(driver.findElement(By.id("canvas")), 0, 120).click().build().perform(); // 3
		a.moveToElement(driver.findElement(By.id("canvas")), 175, 220).click().build().perform(); // =
	}

	public void DIV1cmp() throws IOException {
		BufferedImage im = ImageIO
				.read(new File(System.getProperty("user.dir") + "\\original-SS\\" + "expected-TC9.png"));
		BufferedImage im2 = ImageIO.read(new File(System.getProperty("user.dir") + "\\screenshot\\" + "TC9.png"));
		ImageDiffer IMGDIF = new ImageDiffer();
		ImageDiff diff = IMGDIF.makeDiff(im, im2);

		Assert.assertFalse(diff.hasDiff(), "Images not same");
	}

	public void DIV2() {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("canvas")), 175, -120).click().build().perform(); // CE
		a.moveToElement(driver.findElement(By.id("canvas")), 100, 120).click().build().perform(); // -
		a.moveToElement(driver.findElement(By.id("canvas")), 0, -60).click().build().perform(); // 9
		a.moveToElement(driver.findElement(By.id("canvas")), 100, -60).click().build().perform(); // %
		a.moveToElement(driver.findElement(By.id("canvas")), 0, 120).click().build().perform(); // 3
		a.moveToElement(driver.findElement(By.id("canvas")), 175, 220).click().build().perform(); // =
	}

	public void DIV2cmp() throws IOException {
		BufferedImage im = ImageIO
				.read(new File(System.getProperty("user.dir") + "\\original-SS\\" + "expected-TC10.png"));
		BufferedImage im2 = ImageIO.read(new File(System.getProperty("user.dir") + "\\screenshot\\" + "TC10.png"));
		ImageDiffer IMGDIF = new ImageDiffer();
		ImageDiff diff = IMGDIF.makeDiff(im, im2);

		Assert.assertFalse(diff.hasDiff(), "Images not same");
	}

	public void DIV3() {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("canvas")), 175, -120).click().build().perform(); // CE
		a.moveToElement(driver.findElement(By.id("canvas")), 0, 120).click().build().perform(); // 3
		a.moveToElement(driver.findElement(By.id("canvas")), 100, -60).click().build().perform(); // %%
		a.moveToElement(driver.findElement(By.id("canvas")), 0, -60).click().build().perform(); // 9
		a.moveToElement(driver.findElement(By.id("canvas")), 175, 220).click().build().perform(); // =
	}

	public void DIV3cmp() throws IOException {
		BufferedImage im = ImageIO
				.read(new File(System.getProperty("user.dir") + "\\original-SS\\" + "expected-TC11.png"));
		BufferedImage im2 = ImageIO.read(new File(System.getProperty("user.dir") + "\\screenshot\\" + "TC11.png"));
		ImageDiffer IMGDIF = new ImageDiffer();
		ImageDiff diff = IMGDIF.makeDiff(im, im2);

		Assert.assertFalse(diff.hasDiff(), "Images not same");
	}

	public void DIV4() {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("canvas")), 175, -120).click().build().perform(); // CE
		a.moveToElement(driver.findElement(By.id("canvas")), 0, 120).click().build().perform(); // 3
		a.moveToElement(driver.findElement(By.id("canvas")), 100, -60).click().build().perform(); // %%
		a.moveToElement(driver.findElement(By.id("canvas")), -175, 220).click().build().perform(); // 0
		a.moveToElement(driver.findElement(By.id("canvas")), 175, 220).click().build().perform(); // =
	}

	public void DIV4cmp() throws IOException {
		BufferedImage im = ImageIO
				.read(new File(System.getProperty("user.dir") + "\\original-SS\\" + "expected-TC12.png"));
		BufferedImage im2 = ImageIO.read(new File(System.getProperty("user.dir") + "\\screenshot\\" + "TC12.png"));
		ImageDiffer IMGDIF = new ImageDiffer();
		ImageDiff diff = IMGDIF.makeDiff(im, im2);

		Assert.assertFalse(diff.hasDiff(), "Images not same");
	}

	public void DIV5() {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("canvas")), 175, -120).click().build().perform(); // CE
		a.moveToElement(driver.findElement(By.id("canvas")), -175, 220).click().build().perform(); // 0
		a.moveToElement(driver.findElement(By.id("canvas")), 100, -60).click().build().perform(); // %%
		a.moveToElement(driver.findElement(By.id("canvas")), 0, -60).click().build().perform(); // 9
		a.moveToElement(driver.findElement(By.id("canvas")), 175, 220).click().build().perform(); // =
	}

	public void DIV5cmp() throws IOException {
		BufferedImage im = ImageIO
				.read(new File(System.getProperty("user.dir") + "\\original-SS\\" + "expected-TC13.png"));
		BufferedImage im2 = ImageIO.read(new File(System.getProperty("user.dir") + "\\screenshot\\" + "TC13.png"));
		ImageDiffer IMGDIF = new ImageDiffer();
		ImageDiff diff = IMGDIF.makeDiff(im, im2);

		Assert.assertFalse(diff.hasDiff(), "Images not same");
	}

	// Assert.assertFalse(diff.hasDiff(), "Images not same");

}
