package Selenium;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.actualFirstProPage;
import pageObjects.actualSecondProPage;
import pageObjects.firstItemPage;
import pageObjects.landingPage;
import pageObjects.secondItemPage;
import pageObjects.signinPage;
import pageObjects.subTotalPage;
import pageObjects.todaysDealPage;
import resources.base;

public class homePage extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is successfully Initilaized..");
		driver.manage().window().maximize();

	}

	@Test
	public void scenarioOne() throws IOException {

		driver.get(prop.getProperty("url"));
		landingPage lp = new landingPage(driver);
		lp.signIn().click();

		signinPage sp = new signinPage(driver);
		sp.username().sendKeys("test@emirat.com");
		sp.continueButton().click();
		System.out.println(sp.errorMsg().getText());
		Assert.assertEquals(sp.errorMsg().getText(), "We cannot find an account with that email address");
		log.info("SignIn is not successful..");
		sp.homeButton().click();

	}

	@Test
	public void scenarioTawo() throws IOException {

		landingPage lp = new landingPage(driver);
		lp.todaysDeal().click();

		todaysDealPage tod = new todaysDealPage(driver);
		tod.globalStoreDeals().click();
		/*tod.firstItem().click();

		firstItemPage fid = new firstItemPage(driver);
		fid.firstProduct().click();

		actualFirstProPage afpp = new actualFirstProPage(driver);
		afpp.firstProductSize().click();
		afpp.firstProductQtyThree().click();
		afpp.addToCart().click();

		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();*/

		tod.secondItem().click();

		secondItemPage sid = new secondItemPage(driver);
		sid.secondProduct().click();

		actualSecondProPage aspp = new actualSecondProPage(driver);
		aspp.secondProductQtyTwo().click();
		aspp.addToCart().click();

		subTotalPage stp = new subTotalPage(driver);
		stp.goToBasket().click();

	}

	@Test
	public void scenarioThree() throws IOException {

		landingPage lp = new landingPage(driver);

		Actions action = new Actions(this.driver);
		action.moveToElement(lp.signIn()).perform();
		lp.yourOrders().click();
		signinPage sp = new signinPage(driver);
		System.out.println(sp.getTitle().getText());
		Assert.assertEquals(sp.getTitle().getText(), "Sign in");
		driver.navigate().back();

		action.moveToElement(lp.signIn()).perform();
		lp.yourAddresses().click();
		System.out.println(sp.getTitle().getText());
		Assert.assertEquals(sp.getTitle().getText(), "Sign in");
		driver.navigate().back();

		action.moveToElement(lp.signIn()).perform();
		lp.yourLists().click();

	}
	/*
	 * @AfterTest public void tearDown() { driver.close();
	 * log.info("Driver is successfully closed..."); }
	 */

}
