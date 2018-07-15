package ThirtyDaysOfCode;

import java.util.*;
import java.io.*;

public class Day_8_Dictionaries_and_Maps 
{
	public static void FindOnPhoneBook(Map<String,Integer> PhoneBook,String s) 
	{
		if (PhoneBook.get(s)==null) 
		{
			System.out.println("Not found");
		}
		else
		{
			System.out.println(s+"="+PhoneBook.get(s));
		}		
	}
	
   public static void main(String []argh)
   {
	   Map<String,Integer> PhoneBook = new HashMap<String,Integer>();
	   
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i = 0; i < n; i++)
      {
          String name = in.next();
          int phone = in.nextInt();
          // Write code here
          PhoneBook.put(name,phone);
      }
      while(in.hasNext())
      {
         String s = in.next();
         // Write code here
         FindOnPhoneBook(PhoneBook,s);
      }
      in.close();
   }
}