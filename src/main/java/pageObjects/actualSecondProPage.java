package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class actualSecondProPage {

	public WebDriver driver;

	
	By secondProductQtyTwo = By.xpath("//option[contains(text(),'2')]");
	By addToCart = By.xpath("//input[@id='add-to-cart-button']");

	public actualSecondProPage(WebDriver driver) {

		this.driver = driver;
	}

	

	public WebElement secondProductQtyTwo() {
		return driver.findElement(secondProductQtyTwo);
	}
	public WebElement addToCart() {
		return driver.findElement(addToCart);
	}

}
