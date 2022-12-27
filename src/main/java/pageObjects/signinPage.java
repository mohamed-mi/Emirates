package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signinPage {
	
	public WebDriver driver;
	
	
	By username = By.xpath("//input[@id='ap_email']");
	By continueButton = By.xpath("//input[@id='continue']");
	By errorMsg = By.xpath("//span[@class='a-list-item']");
	By homeButton = By.xpath("//i[@aria-label='Amazon']");
	By getTitle = By.xpath("//h1[normalize-space()='Sign in']");
	
	
	
	
	
	public signinPage(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement username()
	{
		return driver.findElement(username);
	}
	public WebElement continueButton()
	{
		return driver.findElement(continueButton);
	}
	public WebElement errorMsg()
	{
		return driver.findElement(errorMsg);
	}
	public WebElement homeButton()
	{
		return driver.findElement(homeButton);
	}
	public WebElement getTitle()
	{
		return driver.findElement(getTitle);
	}
	
	
	
	
	

}
