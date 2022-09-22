package exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AreOfTriangleTestNG {
	@Test
	public void AreaTestPositive() {
		Assert.assertEquals(25,AreaOfTriangle.area(10,5),0.0002);
	}
	@Test
	public void AreaTestNegative() {
		Assert.assertEquals(26,AreaOfTriangle.area(10,5),0.0002);
	}

}

