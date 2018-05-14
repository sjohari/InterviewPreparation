
package Data_Structures.DynamicProgramming;
import java.util.Scanner;

public class ZeroOneKnapsack {

	static int max(int a, int b){
	    if(a<b)
	        return b;
	    return a;
	}
	public static void main(String[] args) {
		System.out.println("Enter something :");
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int t=0;t<testCases ; t++){
			int noOfItems = sc.nextInt();
			int knapsackCapacity = sc.nextInt();
			int W[]=new int[noOfItems+1]; 
			int V[]=new int[noOfItems+1];  
			int M[][]= new int[noOfItems+1][knapsackCapacity+1];
			for(int i=1;i<=noOfItems;i++){
		        V[i]=sc.nextInt();
		    }
			for(int i=1;i<=noOfItems;i++){
		        W[i]=sc.nextInt();
		    }
			for(int i=0;i<=noOfItems; i++){
		        for(int j=0;j<=knapsackCapacity;j++){
		            M[i][j]=0;
		        }
		    }
			for(int i=1;i<=noOfItems; i++){
		        for(int j=1;j<=knapsackCapacity;j++){
		        	//selecting the i-th item
		            if((j-W[i]) >= 0){
		                M[i][j] = max(M[i][j] , M[i-1][j-W[i]] + V[i]);
		            }
		            //not selecting the i-th item
		            M[i][j] = max(M[i][j] , M[i-1][j]);
		        }
		    }
			System.out.println(M[noOfItems][knapsackCapacity]);
		}
	}

}