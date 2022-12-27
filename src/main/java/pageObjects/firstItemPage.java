package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class firstItemPage {
	
	public WebDriver driver;
	
	
	By firstProduct = By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/span[1]/div[1]/div[1]/a[1]/div[1]");
	
	
	public firstItemPage(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement firstProduct()
	{
		return driver.findElement(firstProduct);
	}
	

}
