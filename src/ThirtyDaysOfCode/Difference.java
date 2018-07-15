package ThirtyDaysOfCode;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Difference {

	private int[] elements;
	public int maximumDifference;

	Difference(int []elements)
	{
		setElements(elements);
	}
	public int[] getElements() {
		return elements;
	}
	public void setElements(int[] elements) {
		this.elements = elements;
	}	
	public void computeDifference() {
		int ant=-1;
		int ret=0;
		for(int i=0;i<getElements().length;i++)
		{			
			if (ant==-1) 
			{
				ant=i;
			}
			if (i>0 && i<getElements().length)  
			{
				int dif=getElements()[ant]-getElements()[i];				
				int aux=Math.abs(dif);				
				if (aux>maximumDifference)
				{
					maximumDifference=aux;
				}
			}
			if(i>0 && i==getElements().length-1)
			{
				if (ant<getElements().length-1)
				{
					ant=ant+1;
					i=ant;
				}
				
			}
		}
	
		
	}
	
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = sc.nextInt();
	        }
	        sc.close();

	        Difference difference = new Difference(a);

	        difference.computeDifference();

	        System.out.print(difference.maximumDifference);
	    }


	
}
