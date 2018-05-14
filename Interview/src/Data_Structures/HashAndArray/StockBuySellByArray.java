package Data_Structures.HashAndArray;

import java.util.Scanner;

public class StockBuySellByArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    

		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int i=0;i<testCase;i++){
			int n = sc.nextInt();
			int A[] = new int[n];
			int count = 0;
			for(int j=0;j<n;j++){
				A[j] = sc.nextInt();
			}
			int l=0;
			int r=1;
    		while(r<n ){
    			    if(A[r] >= A[r-1]){
    			       r++;
    			    }
    			    else if(A[r-1] > A[l]){
    			        System.out.print("(" +l + " " + (r-1) + ") ");
    			        count++;
    			        l=r;
    			        r=r+1;
    			    }
    			    else{
    			        l=r;
    			        r++;
    			    }
    			    
    		}
    		if(A[l] < A[r-1]){
    		    System.out.print("(" +l + " " + (r-1) + ") ");
    		    count++;
    		}
    		
    		if(count ==0)
			    System.out.println("No Profit");
		    else
		        System.out.println();
    			
    	
			
		}


	
	}

}
