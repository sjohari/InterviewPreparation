package Data_Structures.DynamicProgramming;

import java.util.Scanner;

public class MaximumSumDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int t=0;t<testCases ; t++){
			int size = sc.nextInt();
			int arr[] = new int[size+1];
			int sum=0;
			for(int j=1;j<=size;j++){
				arr[j] = sc.nextInt();
				sum = sum + arr[j];
			}
			int M[][] = new int[size][sum];
			int half = sum/2;

			for(int i=0 ; i<=size;i++){
				for(int j=0;j <=sum; j++){
					if(i==0){
						M[i][j] = 0;
						continue;
					}
					if(j==0){
						M[i][j] = 1;
						continue;
					}
					M[0][0] = 1;
					M[i][j] = M[i-1][j];
					if((j-arr[i]) > 0)
						M[i][j] = M[i][j] | M[i-1][j-arr[i]];
				}
			}
			//maximum sum difference between sum of two subsets in an array of integers.
			for(int j=half; j>=0;j-- ){
				if(M[size][j]==1){
					System.out.println(sum - 2*j);
				}
			}
			

		}
	}
}
