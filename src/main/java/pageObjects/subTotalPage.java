package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class subTotalPage {

	public WebDriver driver;

	
	By goToBasket = By.xpath("//a[@href='/gp/cart/view.html?ref_=sw_gtc']");
	

	public subTotalPage(WebDriver driver) {

		this.driver = driver;
	}

	

	public WebElement goToBasket() {
		return driver.findElement(goToBasket);
	}
	

}
