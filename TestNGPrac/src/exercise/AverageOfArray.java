package exercise;

public class AverageOfArray {
	 public static int find_average(int[] array){
		    int sum = 0;
		    
		    for(int i=0; i<array.length; i++) {
		      sum+=array[i];
		    }
		    
		    return sum/array.length;
		  }
		}
