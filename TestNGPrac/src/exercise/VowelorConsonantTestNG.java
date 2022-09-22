package exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VowelorConsonantTestNG {
	public class VowelorConsonantTest {
		@Test
		public void TestVowel() {
			Assert.assertEquals("vowel",VowelorConsonant.vowelorconsonant('a'));

		}
		@Test
		public void TestConsonant() {
			Assert.assertEquals("consonant",VowelorConsonant.vowelorconsonant('s'));

		}
		@Test
		public void TestVowelorConsonant() {
			Assert.assertEquals("consonant",VowelorConsonant.vowelorconsonant('e'));

		}
		}

}
