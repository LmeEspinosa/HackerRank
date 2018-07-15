package ThirtyDaysOfCode;

import java.util.*;

public class Day_11_2DArrays { 
	public static int mayorRelojArena(int [][] arr)	
	{
//		int size=0;
//		int [][] arr = new int [6][6];
//        for(int i=0;i<aux.length;i++ ) 
//        {
//            for(int j=0;j<aux[i].length;j++ )
//            {
//            	
//		      if (aux[i].length<6 && j==aux[i].length-1)
//		      {
//		    	  size = aux[i].length;
//		    	  for(int x=size-1;i<6;i++)
//		    	  {
//		    		  arr[i][x]=0;		    		  
//		    	  }		    	  
//		      }		      
//		      else
//		      {
//		    	  arr[i][j]=aux[i][j];
//		      }
//		      		       	  		    	  		              
//            }
//        }
//        for(int i=0;i<aux.length;i++ ) 
//        {   
//        	System.out.println();
//            for(int j=0;j<aux[i].length;j++ )
//            {
//            
//            	System.out.print(arr[i][j]);
//            	
//            }
//        }
//        System.out.println();

			int ret=-100;
			int parcial=0;
	        for(int i=0;i<6;i++ ) 
	        {
	            for(int j=0;j<6;j++ )
	            {
	            	if(j<4 && i<4)
	            	{            		
	            	   parcial=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
	            	   if (parcial>ret)
	            	   {	            		   	            		   
	            	      ret=parcial;
	            	   }  
	            	}   
	            	else
	            	{
	            	   if (i<4)	
	            	   {
	            		  i+=1;
	            		  j=-1;
	            	   }
	            	}                	                           	
	            }		
			}		
			return ret;	
		}


	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int[][] arr = new int[6][6];

	        for (int i = 0; i < 6; i++) {
	            String[] arrRowItems = scanner.nextLine().split(" ");
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	            for (int j = 0; j < arrRowItems.length ; j++) {
	            	
	                int arrItem = Integer.parseInt(arrRowItems[j]);
	                
	                arr[i][j] = arrItem;
	            }
	        }
	        System.out.println(mayorRelojArena(arr));
	        scanner.close();
	    }
	}


