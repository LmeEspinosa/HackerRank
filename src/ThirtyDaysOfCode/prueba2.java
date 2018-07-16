package ThirtyDaysOfCode;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prueba2 {
    static String[] braces(String[] values) 
    {       
         ArrayList<Character> pend = new ArrayList<Character>();       
         String [] ret = new String [values.length];
         for(int i=0;i<values.length;i++)
         {
              String aux=values[i];
              for(int j=1;j<aux.length();j++)
              {                
                if (aux.charAt(j)=='(')
                {
                	pend.add(aux.charAt(j));
                }	
                else if (aux.charAt(j)=='[')
                {	
                	pend.add(aux.charAt(j));
                }	                	
                else if (aux.charAt(j)=='{')
                {
                	pend.add(aux.charAt(j));
//                	System.out.println("entro { "+pend.size());
                }	
               else if (aux.charAt(j)==')')
               {
            	    
            	    //System.out.println(tam);
                	if (pend.get(pend.lastIndexOf('('))==pend.size()-1)
                	{
                		pend.remove(0);                	
                	}
               }	
               else if (aux.charAt(j)==']')
               {
                	if (pend.get(pend.size()-1)=='[')
                	{
                		pend.remove(0);                
                	}
               }
               else if (aux.charAt(j)=='}')
               {
                	if (pend.get(pend.size()-1)=='{')
                	{
                		pend.remove(0);                	
                	}	
                }                
              }
//              System.out.println(pend.size());
              if(pend.isEmpty())
              {
                 ret[i]="YES";
              }
              else
              {
            	  ret[i]="NO";
              }
          }
      return ret;
     }
    public static boolean ctrlSecuencia(char anterior,char actual)    
    {       	
    	if (anterior==actual)
    	{
    		return true;
    	}
    	else if(anterior=='{')
    	{
    		if(actual=='}'||actual=='['||actual=='(')
    		{
    			return true;
    		}
    	}
    	else if(anterior=='[')
    	{
    		if(actual==']'||actual=='{'||actual=='(')
    		{
    			return true;
    		}
    	}
    	else if(anterior=='(')
    	{
    		if(actual==')'||actual=='{'||actual=='[')
    		{
    			return true;
    		}    		
    	}    	
    	return false;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//       BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int valuesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] values = new String[valuesCount];

        for (int i = 0; i < valuesCount; i++) {
            String valuesItem = scanner.nextLine();
            values[i] = valuesItem;
        }

        String[] res = braces(values);

        for (int i = 0; i < res.length; i++) {
           System.out.println((res[i]));

//            if (i != res.length - 1) {
//                bufferedWriter.write("\n");
//            }
        }

//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }


	
}
