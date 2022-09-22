package exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfarrayTestNG {

@Test
public void SumTestPositive() {
	Assert.assertEquals(15,SumOfarray.sum(new int[]{1,2,3,4,5}));
}
@Test
public void SumTestNegative() {
	Assert.assertEquals(14,SumOfarray.sum(new int[]{1,2,3,4,5}));
}
}

