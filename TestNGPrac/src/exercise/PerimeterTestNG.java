package exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PerimeterTestNG {
	
		@Test
		public void PerimeterTestPositive() {
			Assert.assertEquals(62.8,PerimeterOfCircle.find_Perimeter(10),0.0002);/// third argument is a delta,delta is the maximum difference (delta) between expected and actual for which both numbers are still considered equal.
		}
		@Test
		public void PerimeterTestNegative() {
			Assert.assertEquals(61.6,PerimeterOfCircle.find_Perimeter(10),0.0002);
		}

	}
