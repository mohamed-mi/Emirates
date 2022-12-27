package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	
	public WebDriver driver;
	
	
	By signIn = By.xpath("//a[@id='nav-link-accountList']");
	By todaysdeal = By.linkText("Today's Deals");
	By yourOrders = By.xpath("//span[normalize-space()='Your Orders']");
	By yourAddresses = By.xpath("//span[normalize-space()='Your Addresses']");
	By yourLists = By.xpath("//span[normalize-space()='Your Lists']");
	
	
	
	
	
	public landingPage(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement signIn()
	{
		return driver.findElement(signIn);
	}
	public WebElement todaysDeal()
	{
		return driver.findElement(todaysdeal);
	}
	public WebElement yourOrders()
	{
		return driver.findElement(yourOrders);
	}
	public WebElement yourAddresses()
	{
		return driver.findElement(yourAddresses);
	}
	
	public WebElement yourLists()
	{
		return driver.findElement(yourLists);
	}
	
	

}
