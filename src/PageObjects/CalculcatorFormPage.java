package PageObjects;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculcatorFormPage {

	WebDriver driver;
	
	// Defining the various web elements in the page using Page Factory approach
	@FindBy(xpath = "//div[@id='widget']/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/button")
	WebElement currentAgeIcon;

	@FindBy(xpath = "//div[@id='widget']/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[2]/div/p")
	WebElement currentAgeMessageDisplay;

	@FindBy(xpath = "//div[@id='widget']/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div[1]/div/div/input")
	WebElement currentAgeTextBox;

	@FindBy(xpath = "//div[@id='widget']/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div[1]")
	WebElement employementStatusText;

	@FindBy(xpath = "//div[@id='widget']/descendant::span[text()='Employed']")
	WebElement employementStatusEmployedOption;

	@FindBy(xpath = "//div[@id='widget']/descendant::span[text()='Self-employed']")
	WebElement employementStatusSelfEmployedOption;

	@FindBy(xpath = "//div[@id='widget']/descendant::span[text()='Not employed']")
	WebElement employementStatusNotEmployedOption;

	@FindBy(xpath = "//div[@id='widget']/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input")
	WebElement salaryPerYearText;

	@FindBy(xpath = "//div[@id='widget']/div/div[1]/div/div[1]/div/div[4]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div/div[1]/div/label/span/input")
	WebElement contribution3PercentageOption;

	@FindBy(xpath = "//div[@id='widget']/div/div[1]/div/div[1]/div/div[4]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div/div[2]/div/label/span/input")
	WebElement contribution4PercentageOption;

	@FindBy(xpath = "//div[@id='widget']/div/div[1]/div/div[1]/div/div[4]/div/div/div/div[2]/div[1]/div[1]/div/div/div/div/div[2]/div/label/span/input")
	WebElement contribution8PercentageOption;

	@FindBy(xpath = "//div[@id='widget']/div/div[1]/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[1]")
	WebElement pirBoxText;

	@FindBy(xpath = "//div[@id='widget']/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[1]")
	WebElement pirBox_EmployedText;

	@FindBy(xpath = "//div[@id='widget']/descendant::span[text()='28%']")
	WebElement pirTwentEightPercentOption;

	@FindBy(xpath = "//div[@id='widget']/descendant::span[text()='17.5%']")
	WebElement pirSeventeenPercentOption;

	@FindBy(xpath = "//div[@id='widget']/descendant::span[text()='10.5%']")
	WebElement pirTenPercentOption;

	@FindBy(xpath = "//div[@id='widget']/div/div[1]/div/div[1]/div/div[5]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input")
	WebElement saverBalanceText;

	@FindBy(xpath = "//div[@id='widget']/div/div[1]/div/div[1]/div/div[6]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[1]/div/input")
	WebElement contributionsText;

	@FindBy(xpath = "//div[@id='widget']/div/div[1]/div/div[1]/div/div[9]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[1]/div/label/span[1]/input")
	WebElement riskProfileLowOption;

	@FindBy(xpath = "//div[@id='widget']/div/div[1]/div/div[1]/div/div[7]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[2]/div/label/span[1]/input")
	WebElement riskProfileMediumOption;

	@FindBy(xpath = "//div[@id='widget']/div/div[1]/div/div[1]/div/div[9]/div/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div[3]/div/label/span[1]/input")
	WebElement riskProfileHighOption;

	@FindBy(xpath = "//div[@id='widget']/div/div[1]/div/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input")
	WebElement savingGoalText;

	@FindBy(xpath = "//div[@id='widget']/div/div[1]/div/div[2]/button")
	WebElement submitButton;

	@FindBy(xpath = "//*[@id='widget']/div/div[1]/div/div[1]/div/div[6]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[2]/div/div[1]")
	WebElement frequencySelectBox;

	@FindBy(xpath = "//div[@id='widget']/descendant::span[text()='Fortnightly']")
	WebElement frequencyFortnightlyOption;

	@FindBy(xpath = "//div[@id='widget']/descendant::span[text()='Weekly']")
	WebElement frequencyWeeklyOption;

	@FindBy(xpath = "//div[@id='widget']/descendant::span[text()='Annually']")
	WebElement frequencyAnnuallyOption;

	@FindBy(xpath = "//div[@id='widget']/descendant::span[text()='Monthly']")
	WebElement frequencyMonthlyOption;

	@FindBy(xpath = "//div[@id='widget']/descendant::span[text()='One-off']")
	WebElement frequencyOneoffOption;

	@FindBy(xpath = "//div[@id='widget']/div/div[1]/div/div[3]/div/div[1]/div[1]/div[1]/span[2]")
	WebElement calculatedBalanceLabel;

	//Constructor call to initiate driver and webelements in the page.
	public CalculcatorFormPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String clickCurrentAgeIcon() throws InterruptedException {

		String exactMessage;

		WebDriverWait wait = new WebDriverWait(driver, 20);

		Thread.sleep(1000);

		// Switch to calculator frame
		driver.switchTo().frame(0);

		// The sleep is needed here as the button is stale for few seconds and
		// Selenium is not able to recognize it
		Thread.sleep(1000);

		// Click on the help icon of current age
		clickElement(currentAgeIcon);

		wait.until(ExpectedConditions.visibilityOf(currentAgeMessageDisplay));

		// Get the message displayed on clicking the help icon
		exactMessage = currentAgeMessageDisplay.getText();

		return exactMessage;

	}

	public void calculateRetirementBalance(String currentAge, String employmentStatus, String salary,
			String contribution, String pir, String balance, String voluntaryContribution, String frequency,
			String riskProfile, String savingGoal) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		Thread.sleep(1000);

		// Switch to calculator frame
		driver.switchTo().frame(0);

		// Type the Current age
		currentAgeTextBox.sendKeys(currentAge);

		// section to select the Employment status. The HTML of the page does
		// not support dropdown handle
		if (!employmentStatus.equals(null)) {

			// the sleep is required as the dropdown is inactive but clickable
			// for few seconds
			Thread.sleep(1000);
			clickElement(employementStatusText);

			if (employmentStatus.equals("Self-employed"))
				clickElement(employementStatusSelfEmployedOption);

			else if (employmentStatus.equals("Not employed"))
				clickElement(employementStatusNotEmployedOption);

			else if (employmentStatus.equals("Employed"))
				clickElement(employementStatusEmployedOption);
		}

		if (employmentStatus.equals("Employed")) {

			// For employed populate the salary per year
			wait.until(ExpectedConditions.visibilityOf(salaryPerYearText));
			salaryPerYearText.sendKeys(salary);

			// For Employed populate member contribution

			if (contribution.equals("3%"))
				clickElement(contribution3PercentageOption);
			else if (contribution.equals("4%"))
				clickElement(contribution4PercentageOption);
			else if (contribution.equals("8%"))
				clickElement(contribution8PercentageOption);
			else
				System.out.println("Invalid contribution value" + contribution);

		}

		// Populate the PIR value
		if (employmentStatus.equals("Employed")) {
			wait.until(ExpectedConditions.elementToBeClickable(pirBox_EmployedText));
			clickElement(pirBox_EmployedText);
		}

		else {
			wait.until(ExpectedConditions.elementToBeClickable(pirBoxText));
			clickElement(pirBoxText);
		}

		if (pir.equals("17.5%")) {
			wait.until(ExpectedConditions.elementToBeClickable(pirSeventeenPercentOption));
			clickElement(pirSeventeenPercentOption);
		}

		else if (pir.equals("10.5%")) {
			wait.until(ExpectedConditions.elementToBeClickable(pirTenPercentOption));
			clickElement(pirTenPercentOption);
		}

		// populate the Kiwisaver Balance
		if (!balance.equals(""))
			saverBalanceText.sendKeys(balance);

		// populate the contributions Textbox
		if (!voluntaryContribution.equals(""))
			contributionsText.sendKeys(voluntaryContribution);

		// populate the contribution frequency
		if (!frequency.equals("")) {
			clickElement(frequencySelectBox);

			// For Employed populate member contribution
			if (frequency.equals("One-off"))
				clickElement(frequencyOneoffOption);
			else if (frequency.equals("Weekly"))
				clickElement(frequencyWeeklyOption);
			else if (frequency.equals("Fortnightly"))
				clickElement(frequencyFortnightlyOption);
			else if (frequency.equals("Monthly"))
				clickElement(frequencyMonthlyOption);
			else if (frequency.equals("Annually"))
				clickElement(frequencyAnnuallyOption);
		}

		// Populate the risk Profile
		if (riskProfile.equals("Low"))
			clickElement(riskProfileLowOption);
		else if (riskProfile.equals("Medium"))
			clickElement(riskProfileMediumOption);
		else if (riskProfile.equals("High"))
			clickElement(riskProfileHighOption);
		else
			System.out.println("Invalid Risk Profile value" + contribution);

		// Click on the Savings goal at retirement
		if (!savingGoal.equals(null))
			savingGoalText.sendKeys(savingGoal);

		// click on the retirement projections button
		clickElement(submitButton);

	}

	public String validateCalcualtedResult() {

		try {

			return calculatedBalanceLabel.getText();

		} catch (Exception e) {

			return null;

		}

	}

	// Method to click on any element in the calculator form page to avoid
	// repetition

	public void clickElement(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		try {

			element.click();

		} catch (TimeoutException toe) {

			wait.until(ExpectedConditions.elementToBeClickable(element));

			element.click();

		} catch (Exception e) {

			throw (e);

		}

	}

}
