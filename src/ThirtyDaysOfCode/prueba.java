package ThirtyDaysOfCode;


import java.io.IOException;
import java.util.Scanner;

public class prueba {

	  static int countHoles(int num) {
	         String n="";
	             n=n+num;
	         int ret=0;
	        for(int i=0;i<n.length();i++)
	        {
	            if(n.charAt(i)=='0' ||(n.charAt(i)=='4'||(n.charAt(i)=='6'||(n.charAt(i)=='9'))))
	            {
	                   ret+=1;                                              
	            }
	            else if(n.charAt(i)=='8')
	            {
	                   ret+=2;                                           
	            }
	        }
	      return ret;
	    }
	  
	   private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
//	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int num = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int res = countHoles(num);
            System.out.println(res);
//	        bufferedWriter.write(String.valueOf(res));
//	        bufferedWriter.newLine();

//	        bufferedWriter.close();

	        scanner.close();
	    }
	}
	

