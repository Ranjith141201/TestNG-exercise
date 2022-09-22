package exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DuplicateTestNG {
	@Test
	public void DuplicateTestPositve() {
		Assert.assertEquals("duplicate",Duplicate.find_duplicate(new int[]{1,2,3,4,2}));
	}
	@Test
	public void DuplicateTestNegative() {
		Assert.assertEquals(5,Duplicate.find_duplicate(new int[]{1,2,3,4,5}));
	}
}
