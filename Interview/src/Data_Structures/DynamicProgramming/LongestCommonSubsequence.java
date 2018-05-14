package Data_Structures.DynamicProgramming;

import java.util.Scanner;

public class LongestCommonSubsequence {


    static int max(int a, int b){
        if(a>b)
            return a;
        return b;
    }
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int t=0;t<testCases ; t++){
		    int length1 = sc.nextInt();
			int length2 = sc.nextInt();
			String string1= sc.next();
			String string2= sc.next();
			int M[][] = new int[length1+1][length2+1];
			for(int i=0; i<=length1;i++){
			    for(int j=0;j <=length2;j++){
			        if(i==0 || j==0)
			            M[i][j] = 0;
			        else {
    			        if(string1.charAt(i-1)==string2.charAt(j-1)){
    			            M[i][j] = M[i-1][j-1] + 1;
    			        }
    			        M[i][j] = max(M[i-1][j],M[i][j]);
    			        M[i][j] = max(M[i][j-1],M[i][j]);
			        }
			    }
			}
			System.out.println(M[length1][length2]);
		}
	}


}
