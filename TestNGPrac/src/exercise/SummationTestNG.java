package exercise;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SummationTestNG {
@Test
public void TestSummation() {
Assert.assertEquals(15,Summation.SumOfNumbers(5));
}
@Test
public void TestSumation() {
Assert.assertEquals(15,Summation.SumOfNumbers(4));
}
}

