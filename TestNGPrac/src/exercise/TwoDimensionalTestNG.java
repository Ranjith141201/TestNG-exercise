package exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoDimensionalTestNG {
	public class TwoDimensionalTest {
		@Test
		public void TwoDimensionalTestPositve() {
			
			Assert.assertEquals("same",TwoDimensional.TwoDimCompare(new int[]{1,2,3,4,5},new int[]{1,2,3,4,5}));
		}
		@Test
		public void TwoDimensionalTestNegative() {
			Assert.assertEquals("same",TwoDimensional.TwoDimCompare(new int[]{1,2,3,4,5},new int[]{1,2,3,4,6}));
		}
	}

}
