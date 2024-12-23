package testBase;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.enterVehicleData;
import pageObjects.homePage;

public class ObjectsRepo {
	 public static WebDriver driver;
	  public static ExtentReports extent;
	  public static ExtentTest test;
	  public static homePage home;
	  public static enterVehicleData vehecalData;
}
