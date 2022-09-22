package exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseStringTestNG {
	@Test
	public void ReverseStringTestPositive() {
		Assert.assertEquals("now",ReverseString.reverseString("won"));
	}
	@Test
	public void ReverseStringTestNegative() {
		Assert.assertEquals("Java",ReverseString.reverseString("Java"));
	}
}
