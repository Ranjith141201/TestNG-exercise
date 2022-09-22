package exercise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GcdTestNG {
	@Test  
    public void FindGcdPositive(){  
        Assert.assertEquals(6,Gcd.findgcd(24,18));  
       
    }  
    
    @Test  
    public void FindGcdNegative(){  
         Assert.assertEquals(3,Gcd.findgcd(24,18));  
       
    }  
}
