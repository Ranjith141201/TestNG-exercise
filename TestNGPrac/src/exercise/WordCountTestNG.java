package exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WordCountTestNG {
	@Test
	public void WordCountTestPositive() {
		Assert.assertEquals(4,WordCount.wordcount("The train was late"));

	}
	@Test
	public void WordCountTestNegative() {
		Assert.assertEquals(5,WordCount.wordcount("The train was late"));

}
}
