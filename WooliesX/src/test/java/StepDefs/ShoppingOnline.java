package StepDefs;

import PageObjects.MyStore;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

public class ShoppingOnline {
	public static WebDriver driver;
	MyStore ms;

	public ShoppingOnline() {
		driver = Hooks.driver;
	}

	@Given("^I navigate to the (.+?)$")
	public void iNavigateToThe(String url) {
		driver.get(url);
		Assert.assertTrue("My Store".equalsIgnoreCase(driver.getTitle()));
		ms = new MyStore(driver);

	}

	@When("^I search for (.+?)$")
	public void iSearchFor(String searchTask) {
		ms.setSearchTask(searchTask);
		ms.clickSearchButton();
	}

	@When("^I Navigate to the searched page$")
	public void iNavigateToTheSearchedPage() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Assert.assertTrue("Search - My Store".equalsIgnoreCase(driver.getTitle()));
	}

	@When("^I Click on 1st Product$")
	public void iClickOnFirstProductButton() {
		ms.clickfirstProductLink();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("^I Click on Add to cart Button$")
	public void iClickOnAddToCartButton() throws InterruptedException {
		ms.clickaddtoCartButton();
		driver.navigate().refresh();
		ms.clickSearchButton();

	}

	@When("^I Click on 2nd Product$")
	public void iClickOnSecondProductButton() {
		ms.clicksecondProductLink();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}

	@When("^I Click on Add to cart Button1$")
	public void iClickOnAddToCartButton1() {
		ms.clickaddtoCartButton1();
		driver.navigate().refresh();
		

	}

	@When("^I Proceed to gotoCart Button$")
	public void iClickOnGoToCartButton() {
		ms.clickGotoCart();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@When("I Click on Proceed to checkout$")
	public void iClickOnProceedToCheckOut() {
		ms.clickproceedtoCheckoutButton();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@When("I Enter the emailaddress (.+?)$")
	public void iEnterEmailAddress(String Tasks) {
		ms.enterEmail(Tasks);
		

	}

	@When("I Enter the password (.+?)$")
	public void iEnterPassword(String Tasks) {
		ms.enterPassword(Tasks);
		

	}

	@When("^I Click Sign in Button$")
	public void iClickOnSignInButton() {
		ms.clickSigninButton();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@When("I Click on Second Proceed to checkout$")
	public void iClickOnSecondProceedToCheckOut() {
		ms.clickSecondproceedtoCheckoutButton();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("^I Select Terms of service checkbox$")
	public void iClickTermsandConditionsCheckBox() {
		ms.clicktandcCheckbox();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@When("I Click on Final Proceed to checkout$")
	public void iClickOnFinalProceedToCheckOut() {
		ms.clickfinalproceedtoCheckoutButton();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@When("I Click on Pay by bank wire$")
	public void iClickPaybyBankWire() {
		ms.clickpaybybankWireButton();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@When("I Click on I confirm my order Button$")
	public void iClickConfirmOrderButton() {
		ms.clickconfirmOrderButton();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Then("^I Should see confirmation Text$")
	public void seeOrderConfirmation() {
		String actualString = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p/strong")).getText();

		Assert.assertTrue(actualString.contains("Your order on My Store is complete."));

	}

}
