package TestNG;

import org.testng.annotations.Test;

public class TestNG_1 {
         //one @Test = annotation is equal to one Test Case/Test Scenario 
@Test
         //@Beforeclass = for making this method to shown in First position in Output
         //@BeforeMethod = To execute Before every Test Case	
	public void login () {
		System.out.println("Login Completed");
	}
@Test
         //@AfterClass = for making this method to shown in Last position in Output
         //@AfterMethod = To execute After every Test Case 	
	public void logout() {
		System.out.println("Logout Completed");
	}
//(priority = 1) is a condition to decide Priority of Test Case
@Test (priority=1)
	public void addEmp() {
		System.out.println("Employee Added");
	}
@Test (priority=2)
	public void deleteEmp() {
		System.out.println("Employee Deleted");
	}
}
