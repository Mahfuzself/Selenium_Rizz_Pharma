package InsuranceCalculator_Motorcycle;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import testBase.TestBase;

public class ErrorTests_Motorcycle extends TestBase{

	@Test
	   public  void errorMessage_PayloadField() throws Exception {
		home.ClickMotorCycleLink();
		Thread.sleep(5000);
		vehecalData.inputCylenderCapacity();
     	test.log(Status.PASS, "Cylender capacity is filled with data : 2000");
		String actualError = vehecalData.AssertCylenderCapacityErrorMessage();
		String expectedError = "Must be a number between 1 and 2000";
		Assert.assertEquals(actualError,expectedError,"Error message is not as expected on cylender capacity field" );
		   
	   }
	@Test
	   public  void errorMessage_PayloadField1() throws Exception {
		home.ClickMotorCycleLink();
		Thread.sleep(5000);
		vehecalData.inputCylenderCapacity();
		test.log(Status.FAIL, "Cylender capacity is filled with data : 3333");
		String actualError = vehecalData.AssertCylenderCapacityErrorMessage();
		String expectedError = "Must be a number between 1 and 3000";
		Assert.assertEquals(actualError,expectedError,"Error message is not as expected on cylender capacity field" );
		   
	   }

} 
