package ThirtyDaysOfCode;

import java.util.*;

public class Day_7_Arrays 
{
   public static void InverseIntegersArray(int [] Array) 
   {
	   for (int i=Array.length;i>0;i--) 
	   {
		   
		   if (i==Array.length) 
		   {
		      System.out.print(Array[i-1]);
		   }
		   else 
		   {
			  System.out.print(" "+Array[i-1]);
		   }
	   }
   }
   
   private static final Scanner scanner = new Scanner(System.in);
   
   public static void main(String[] args) 
   {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] arr = new int[n];

	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) 
	        {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	            
	        }
	        InverseIntegersArray(arr);

	        scanner.close();
	}
}

