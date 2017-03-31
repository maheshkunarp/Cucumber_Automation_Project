package StepDefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import PageObjects.*;
import cucumber.api.java.en.*;

public class Scenario1Definition {

	LandingPage landing;
	CalculatorPage calculator;
	CalculcatorFormPage forms;
	WebDriver driver;
	String helpMessage;

	@Given("^I want to navigate to Westpac NZ$")
	public void navigateToWestpacPage() throws Throwable {

		// System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
		// driver = new FirefoxDriver();
		
		// setting for starting Chrome browser
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Open the westpac NZ link
		driver.get("http://www.westpac.co.nz/");
		driver.manage().window().maximize();

	}

	@And("^Navigate to Calculator form page$")
	public void navigateToCalculatorForm() throws Throwable {

		landing = new LandingPage(driver);
		calculator = new CalculatorPage(driver);

		landing.clickKiwiSaverCalculator();
		calculator.clickGetStartedCalculator();

	}

	@When("^I click on the help icon next to Current age textbox$")
	public void clickOnHelpIcon() throws Throwable {
		forms = new CalculcatorFormPage(driver);
		helpMessage = forms.clickCurrentAgeIcon();
	}

	@Then("^Help Messgae is shown on page$")
	public void validateHelpIconMessage() throws Throwable {
		Assert.assertEquals(
				"This calculator has an age limit of 64 years old as you need to be under the age of 65 to join KiwiSaver.",
				helpMessage);
		//close the driver
		driver.close();

	}

	@When("^I fill in \"(.*?)\" \"(.*?)\" \"(.*?)\" \"(.*?)\" \"(.*?)\" \"(.*?)\" \"(.*?)\" \"(.*?)\" \"(.*?)\" \"(.*?)\"$")
	public void fillInCalculatorForm(String currentAge, String employmentStatus, String salary, String contribution,
			String pir, String balance, String voluntaryContribution, String frequency, String riskProfile,
			String savingGoal) throws Throwable {
		forms = new CalculcatorFormPage(driver);

		// Write the code to pass values to form page
		forms.calculateRetirementBalance(currentAge, employmentStatus, salary, contribution, pir, balance,
				voluntaryContribution, frequency, riskProfile, savingGoal);
	}

	@Then("^I should get calculated projected balances$")
	public void validateCalculatedBalance() throws Throwable {
		forms = new CalculcatorFormPage(driver);

		// Get the calculated Retirement balance
		String calculatedBalance = forms.validateCalcualtedResult();
		System.out.println("The calculated Retirement Balance is" + calculatedBalance);
		Assert.assertFalse(calculatedBalance.equals(""));

		// Close the driver
		driver.close();
	}

}
