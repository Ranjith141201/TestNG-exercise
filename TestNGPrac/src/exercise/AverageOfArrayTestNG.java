package exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AverageOfArrayTestNG {
	@Test
	public void AverageOfArrayTestPositive() {
		Assert.assertEquals(2,AverageOfArray.find_average(new int[]{1,2,3}));
	}
	@Test
	public void AverageOfArrayTestNegative() {
		Assert.assertEquals(14,AverageOfArray.find_average(new int[]{1,2,3,4,5}));
	}
}
