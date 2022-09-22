package exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WordSearchTestNG {
	@Test
	public void WordSearchTestPositive() {
		Assert.assertEquals("present",WordSearch.Wordsearch("The train was late","train"));

	}
	@Test
	public void WordSearchTestNegative() {
		Assert.assertEquals("present",WordSearch.Wordsearch("The train was late","truck"));

}
}

