package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class actualFirstProPage {

	public WebDriver driver;

	By firstProductSize = By.xpath("//option[@id='native_size_name_0']");
	By firstProductQtyThree = By.xpath("//option[@value='3']");
	By addToCart = By.xpath("//input[@id='add-to-cart-button']");

	public actualFirstProPage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement firstProductSize() {
		return driver.findElement(firstProductSize);
	}

	public WebElement firstProductQtyThree() {
		return driver.findElement(firstProductQtyThree);
	}
	public WebElement addToCart() {
		return driver.findElement(addToCart);
	}

}
