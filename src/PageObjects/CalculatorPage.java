package PageObjects;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage {

	WebDriver driver;
	@FindBy(linkText = "Click here to get started.")
	WebElement linkToGetStarted;
	
	// constructor to initiate driver and web elements in the page

	public CalculatorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// click on the KiwiSaver link in the home page

	public void clickGetStartedCalculator() {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		// Click on the Get Started button

		try {

			linkToGetStarted.click();

		} catch (TimeoutException toe) {

			wait.until(ExpectedConditions.elementToBeClickable(linkToGetStarted));

			linkToGetStarted.click();

		} catch (Exception e) {

			throw (e);

		}
	}

}
