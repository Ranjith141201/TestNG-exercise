package exercise;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringLengthTestNG {
	@Test
	public void TestStringLength() {
	Assert.assertEquals(4,StringLength.length("Java"));
		}
	@Test
	public void TestStringLengthNeg() {
		Assert.assertEquals(10,StringLength.length("Javapoint"));
	}
	}

