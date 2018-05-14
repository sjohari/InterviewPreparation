package Data_Structures.DynamicProgramming;

import java.util.Scanner;

public class EditDistance {

    static int min(int a, int b){
	    if(a<b)
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
			    	// If first string is empty, only option is to
		            // insert all characters of second string
			        if(i==0)
			            M[i][j] = j;
			        // If second string is empty, only option is to
		            // remove all characters of second string
			        else if(j==0)
			            M[i][j] = i;
			        // If last characters are same, ignore last char
		            // and recur for remaining string
			        else if(string1.charAt(i-1)==string2.charAt(j-1)){
			            M[i][j] = M[i-1][j-1];
			        }else{
			        	// If last character are different, consider all
			            // possibilities and find minimum
			            M[i][j] = min(M[i-1][j-1],M[i-1][j]);
			            M[i][j] = min(M[i][j],M[i][j-1]);
			            M[i][j] = M[i][j] + 1;
			        }
			        
			    }
			}
			System.out.println(M[length1][length2]);
		}
	}
}
