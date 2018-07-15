package ThirtyDaysOfCode;

import java.io.*;
import java.util.*;

public class Day_6_LetsReview {

    public static String ParesEImpares(String word)
    {
        String ret="";
        String pares="";
        String impares="";
        for (int i = 0; i < word.length(); i++) {
            if (i%2==0){
               pares = pares+word.charAt(i);   
            }
            else
            {    
               impares = impares+word.charAt(i);
            }       
        }
        ret = pares +" "+impares;
        return ret;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should  be named Solution. */
        Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int i = 1; i <= T; i++) {
			String palabra = scan.nextLine();
			if (i!=0)
			{
            System.out.println(ParesEImpares(palabra));
			}
        }
		scan.close();
    }
}
