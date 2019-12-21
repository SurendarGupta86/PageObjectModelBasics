package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Page;

public class FindJobs extends Page {
	public void doFindJobs(String searchtext, String location) {

		menu.gotoFindJobs();
		type("What_CSS", searchtext);

		type("Where_CSS", Keys.chord(Keys.CONTROL, "a", Keys.DELETE)); // To Delete the text in Where Box

		// driver.findElement(By.cssSelector("#text-input-where")).sendKeys(Keys.chord(Keys.CONTROL,"a",
		// Keys.DELETE));

		type("Where_CSS", location);
		click("FindJobsBtn_CSS");

		/*
		 * Boolean b = isElementPresent(By.cssSelector("#popover-x > a"));
		 * 
		 * if(b=false) { System.out.println("No Alert Present"); }else {
		 * click("PopupCancel_CSS"); }
		 */

		/*
		 * WebElement pop = driver.findElement(By.cssSelector("#popover-x > a")); if(pop
		 * == null) { System.out.println("No Alert Present"); }else{
		 * click("PopupCancel_CSS"); }
		 */

		/*
		 * WebElement elems = driver.findElement(By.cssSelector("#popover-x > a")); if
		 * (elems == null) { System.out.println("My element was not found on the page");
		 * } else System.out.println("My element was found on the page");
		 * //click("PopupCancel_CSS");
		 */

		FluentWait<WebDriver> await = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(500, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);

		try {
			await.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#popover-x > a"))));
			click("PopupCancel_CSS");
		} catch (NoSuchElementException e) {
		}

	}
}
