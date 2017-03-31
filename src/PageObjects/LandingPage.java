package PageObjects;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {

	WebDriver driver;
	//Define the web elements in the Landing page of westapc NZ
	@FindBy(linkText = "KiwiSaver")
	WebElement linkToKiwiSaver;

	@FindBy(linkText = "KiwiSaver calculators")
	WebElement linkToCalculator;

	//Constructor to initiate the driver and web elements in the page.
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// click on the KiwiSaver calculator link in the home page

	public void clickKiwiSaverCalculator() {
		Actions action = new Actions(driver);
		action.moveToElement(linkToKiwiSaver);
		action.perform();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		//Click on the KiwiSaver Link in the home page
		try {

			linkToCalculator.click();

		} catch (TimeoutException toe) {

			wait.until(ExpectedConditions.elementToBeClickable(linkToCalculator));

			linkToCalculator.click();

		} catch (Exception e) {

			throw (e);

		}
	}

}
