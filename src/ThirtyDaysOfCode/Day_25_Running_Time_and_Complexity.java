package ThirtyDaysOfCode;

import java.util.Scanner;

public class Day_25_Running_Time_and_Complexity {
	
	public static void isPrime(int [] arr)
	{		
		for (int i=0;i<arr.length;i++)
		{
            prime(arr[i]);
		}	
	}
	
	public static void prime(int n) 
	{
		int cont=0;		
		for(int j=1;j<=n;j++)
		{
			if (n==1)
			{
				System.out.println("Not prime");
				break;
			}
			else if (cont>2)
			{
				System.out.println("Not prime");
				break;
			}
			else
			{
				if(n%j==0)
				{
					cont+=1;
				}
			}

		}
		if(cont==2)
		{
			System.out.println("Prime");	
		}
	    	
	}
	
	
	   private static final Scanner scanner = new Scanner(System.in);
	   
	   public static void main(String[] args) 
	   {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		        int[] arr = new int[n];

		        for (int i = 0; i < n; i++) 
		        {
		        	if(scanner.hasNextInt())
		        	{
			          int x = scanner.nextInt();		        	
			          scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");			       
		              arr[i] = x;
		        	}
		        	else
		        	{
		        		arr[i] = 0;
		        	}
		            
		        }
		        isPrime(arr);
		        scanner.close();
		}

}
