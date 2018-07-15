package ThirtyDaysOfCode;

import java.util.*;


public class Day_10_Binary_Numbers {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static String Reverso(String a)
    {
    	String ret="";
        for(int i=a.length()-1;i>=0;i--)
        {
        	ret=ret+a.charAt(i);
        }
        
    	return ret; 
    }
    public static int contarConsecutivos(String a)
    {
       int ret=0; 
       char ant='\0';
       int index=0;
       int parcial=0;
       for (int i=0;i<a.length();i++)
       {
    	   if (a.charAt(i)=='1')     			   
    	   {
    		 if (ant=='\0')
    		 {
    			 ant=a.charAt(i);
    			 index=i;
    			 parcial=1;
    		 }
    		 else
    		  {    			
    			 if((i>0) && (index==i-1)) 
    			 {    				
    				parcial+=1;    				
    			 }
    			 index=i;    				 
    		  }
    	   }
    	   else
    	   {      	    		   
    		  if (parcial>ret)  
    		   {
    			  ret=parcial; 
    		   }
    	      parcial=1;
    	      ant='\0';
    	   } 
	     }
		  if (parcial>ret)  
		   {
			  ret=parcial; 
		   }       
       return ret;
    } 
    
    public static String ConvertToBinary(int n)
    {	
    	String ret;    	
    	String aux="";
    	while(n>=2)
        {    	  
            int digit=(n%2);
            aux=aux+digit;
            n=n/2;                                 
        }          
        aux=aux+"1";
        ret=Reverso(aux);
        return ret;
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s=ConvertToBinary(n);
        //System.out.println(s);
        System.out.println(contarConsecutivos(s));
        scanner.close();
    }

	
}
