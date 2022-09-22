package exercise;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinearSearchTestNG {
	@Test
	public void LinearSearchTestPositve() {
		Assert.assertEquals(1,LinearSearch.linearSearch(new int[]{1,2,3,4,5}, 2));
	}
	@Test
	public void LinearSearchTestNegative() {
		Assert.assertEquals(3,LinearSearch.linearSearch(new int[]{1,2,3,4,5}, 3));
	}
}
