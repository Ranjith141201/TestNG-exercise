package exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AreaOfCircleTestNG {
	@Test
	public void AreaTestPositive() {
		Assert.assertEquals(314,AreaOfCircle.find_Area(10),0.0002);
	}
	@Test
	public void AreaTestNegative() {
		Assert.assertEquals(315,AreaOfCircle.find_Area(10),0.0002);
	}

}
