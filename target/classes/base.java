package resources;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class base {

	public static WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\moham\\eclipse-workspace\\Emirates\\src\\main\\java\\resources\\data.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\Chrome_Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("Firfox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\Chrome_Driver\\geckodriver.exe");
			driver = new ChromeDriver();


		} else if (browserName.equals("MS Edge")) {
		


		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

	public String getScreenShot(String testCaseName, WebDriver driver) throws IOException {
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			String destination = System.getProperty("user.dir")+"\\reports\\" +testCaseName+".png";
			FileUtils.copyFile(source,new File(destination));
			return destination;
		}

		/*	String screenName = System.currentTimeMillis() + ".png";
		File ts = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// File source =ts.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(ts, new File(System.getProperty("user.dir") + "/target/" + screenName+"" ));
		} catch (IOException e)

		{
			System.out.println(e.getMessage());

			
			 * String destinationFile =
			 * System.getProperty("user.dir")+"\\reports\\"+screenName+".png"; 
			 * //File finalDestination = new File(destinationFile); 
			 * //FileUtils.copyFile(source,finalDestination);
			 *  return destinationFile;
			 */
		

	}
}
