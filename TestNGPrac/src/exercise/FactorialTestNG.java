package exercise;
import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FactorialTestNG {
	 @Test  
	 public void testFactorial() {
		 Assert.assertEquals(6,Factorial.factorial(3));
	 }

	 public class FactorialTesting {
		 @Test  
		 public void testFactorial() {
			 Assert.assertEquals(10,Factorial.factorial(4));
		 }

	 
	 }
}
