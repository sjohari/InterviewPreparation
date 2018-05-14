package Data_Structures.HashAndArray;

import java.util.HashMap;
import java.util.Scanner;

public class ZeroSumSubarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testCases;
		testCases = sc.nextInt();
		int n;
		for(int p=0;p<testCases;p++){
			n = sc.nextInt();
			int A[] = new int[n];
			A[0]= sc.nextInt();
			int c=0;
			for(int i=1;i<n;i++){
				A[i]= sc.nextInt();
				if(A[i] == 0 && A[i-1]!=0){
					c++;
				}
				A[i] = A[i] + A[i-1];
			}
			HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();

			for(int i=0;i<n;i++){
				if(hash.get(A[i])==null){
					hash.put(A[i], 1);
				}else{
					c = c + hash.get(A[i]);
					hash.put(A[i], hash.get(A[i])+1);
				}
			}
			System.out.println(c);
		}
	}

}

