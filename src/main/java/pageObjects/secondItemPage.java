package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class secondItemPage {
	
	public WebDriver driver;
	
	
	By secondProduct = By.xpath("//body/div[@id='a-page']/div[3]/div[1]/div[2]/div[1]/ul[1]/li[1]/span[1]/div[1]/div[1]/a[1]/div[1]");
	
	
	public secondItemPage(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement secondProduct()
	{
		return driver.findElement(secondProduct);
	}
	

}
