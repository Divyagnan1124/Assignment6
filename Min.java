package fs;

import java.util.Arrays;

public class Min {
	  public static void main(String[] args){
	        int arr[] = {10, 324, 45, 90, 9808};
	        int min = Arrays.stream(arr).min().getAsInt();
	        System.out.println("smallest in given array is " +min);
	    }
	 

}
