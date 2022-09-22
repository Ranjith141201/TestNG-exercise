package exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class QuadrantTestNG {
@Test
public void TestQuadrant() {
Assert.assertEquals(1,Quadrant.quadrant(1,1));
}
@Test
public void TestQuadrantNegative() {
Assert.assertEquals(2,Quadrant.quadrant(1,-1));
	}
}

