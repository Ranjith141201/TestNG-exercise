package bookings;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BookFlight {
	@BeforeMethod
	public void BeforeMethod_TestCase1() {
		System.out.println("this code will run before every test case");
	}
	@AfterMethod
	public void AfterMethod_TestCase1() {
		System.out.println("this code will run after every test case");
	}
@Test
public void Book_Flight_RoundTrip_TestCase1() {
	System.out.println("TestCase1");
}
@Test(dependsOnMethods={"Book_Flight_RoundTrip_TestCase1"})
public void Book_Flight_RoundTrip_TestCase2() {
	System.out.println("TestCase2");
}
 @BeforeTest
public void beforetest() {
	System.out.println("this should be first");
}
 @AfterTest
public void aftertest() {
	System.out.println("this should be last");
}
@Test(enabled=false)
public void Book_Flight_OneWay_TestCase3() {
	System.out.println("TestCase3");
}
}
