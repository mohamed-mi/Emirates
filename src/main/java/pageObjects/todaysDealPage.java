package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class todaysDealPage {
	
	public WebDriver driver;
	
	By globalStoreDeals = By.xpath("//span[contains(text(),'Global Store Deals')]");
	By firstItem = By.xpath("//body/div[@id='a-page']/div[@id='slot-15']/div[@id='slot-15']/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]");
	By secondItem = By.xpath("//body/div[@id='a-page']/div[@id='slot-15']/div[@id='slot-15']/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]");
	
	public todaysDealPage(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement globalStoreDeals()
	{
		return driver.findElement(globalStoreDeals);
	}
	public WebElement firstItem()
	{
		return driver.findElement(firstItem);
	}
	public WebElement secondItem()
	{
		return driver.findElement(secondItem);
	}

}
