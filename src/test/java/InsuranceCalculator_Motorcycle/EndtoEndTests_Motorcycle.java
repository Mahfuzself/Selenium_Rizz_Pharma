package InsuranceCalculator_Motorcycle;
import org.testng.annotations.Test;

import testBase.TestBase;

public class EndtoEndTests_Motorcycle extends TestBase {

	@Test
   public  void InsuranceCalculator_VolvoMotor() throws Exception {
		
		System.out.println(driver.getTitle());
	   
   }
	@Test
	   public  void InsuranceCalculator_fordMotor() throws Exception {
			
			System.out.println(driver.getCurrentUrl());
		   
	   }
	
}
