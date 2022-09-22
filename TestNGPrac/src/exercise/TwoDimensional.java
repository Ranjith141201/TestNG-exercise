package exercise;

public class TwoDimensional {
	public static String TwoDimCompare(int[] array1,int[] array2) 
	{   
		 for (int i = 0; i < array1.length; i++)
	        {
	            for (int j = 0; j < array2.length; j++)
	            {
	                if(array1[i] == (array2[j]))
	                {
	                 
	                return "same";
	                 }
	                else
	                {
	                	return "not same";
	                }
	            }
	        }
		return null;
		
		

	
	}
}