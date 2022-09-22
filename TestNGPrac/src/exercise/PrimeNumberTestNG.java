package exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeNumberTestNG {
	public class PrimeNumberTest {
		@Test
		public void PrimeNumberTestPositive() {
			Assert.assertEquals("true",PrimeNumber.isPrime(2));
		}
		@Test
		public void PrimeNumberTestNegative() {
			Assert.assertEquals("true",PrimeNumber.isPrime(4));
		}
}
}
