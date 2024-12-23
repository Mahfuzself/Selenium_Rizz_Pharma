package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.enterVehicleData;
import pageObjects.homePage;
import reusableComponents.propertiesOperations;

public class TestBase extends ObjectsRepo{
	public static WebDriver driver;
	
	public void LunchBrowserAndNavigate() throws Exception {
		String browser = propertiesOperations.getPropertyValueByKey("browser");
		String url = propertiesOperations.getPropertyValueByKey("url");
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		   driver.manage().window().maximize();
		   driver.get(url);
	}
	
	@BeforeMethod
	public void setupMethod() throws Exception {
		LunchBrowserAndNavigate();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		home = new homePage();
		vehecalData = new enterVehicleData();
	}
	@AfterMethod
	public void clearup() {
		driver.quit();
	}
	
	   
	   

}
