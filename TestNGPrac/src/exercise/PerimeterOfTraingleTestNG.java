package exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PerimeterOfTraingleTestNG {
	
		@Test
		public void PerimeterOfTriangleTestPositive() {
			Assert.assertEquals(36,PerimeterOfTriangle.findPerimeter(10,12,14),0.0002);
		}
		@Test
		public void PerimeterOfTriangleTestNegative() {
			Assert.assertEquals(38,PerimeterOfTriangle.findPerimeter(10,12,15),0.0002);
		}
		}

