package Data_Structures.DynamicProgramming;

import java.util.Scanner;

public class LongestCommonSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int t=0;t<testCases ; t++){
		    int length1 = sc.nextInt();
			int length2 = sc.nextInt();
			String string1= sc.next();
			String string2= sc.next();
			int M[][] = new int[length1+1][length2+1];
			int max = 0; 
			for(int i=0; i<=length1;i++){
			    for(int j=0;j <=length2;j++){
			        if(i==0 || j==0)
			            M[i][j] = 0;
			        else if(string1.charAt(i-1)==string2.charAt(j-1)){
			            M[i][j] = M[i-1][j-1] + 1;
			            if(M[i][j] >  max)
			                max = M[i][j];
			        }else{
			            M[i][j] = 0;
			        }
			    }
			}
			System.out.println(max);
		}
	}

}






