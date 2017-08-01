package testPackage;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import reUsablePackage.Calculator;

public class TestNGUsage {
	
	Calculator cal = new Calculator();
	
	@Test(dataProvider = "dp")
	public void testNGUsage(Double First,Double Second, String message) {
		String additionOfTwoNumbers = String.valueOf(cal.add(First,Second));
		Reporter.log("Test: Addition of two numbers"+additionOfTwoNumbers,true);
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Before Method: Addition of two numbers(10,20)"+cal.add(10,20),true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("After Method: Subtraction of two numbers(10,20)"+cal.sub(10,20),true);
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 10.0,20.0, "Addition of two numbers" }, new Object[] { 20.0,40.0, "Addition of two numbers" }, };
	}

	@BeforeClass
	public void beforeClass() {
		Reporter.log("Before Class: Multiplication of two numbers(10,20)"+cal.mul(10,20),true);
	}

	@AfterClass
	public void afterClass() {
		Reporter.log("After Class: Multiplication of two numbers(10,20)"+cal.mul(10,20),true);
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before Test: Division of two numbers(20,10)"+cal.div(20,10),true);
	}

	@AfterTest
	public void afterTest() {
		Reporter.log("After Test: Division of two numbers(20,10)"+cal.div(20,10),true);
	}

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Before Suite: Addition of two numbers(10,20)"+cal.add(10,20),true);
	}

	@AfterSuite
	public void afterSuite() {
		Reporter.log("After Suite: Addition of two numbers(10,20)"+cal.add(10,20),true);
	}

}
