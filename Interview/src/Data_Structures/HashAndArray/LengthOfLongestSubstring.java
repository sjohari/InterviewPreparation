package Data_Structures.HashAndArray;

import java.util.Scanner;


/**
 * Length of the longest substring without repeating characters
 * Given a string, find the length of the longest substring without repeating characters. For example, the longest substrings without repeating characters for ???ABDEFGABEF??? are ???BDEFGA??? and ???DEFGAB???, with length 6. For ???BBBB??? the longest substring is ???B???, with length 1. For ???GEEKSFORGEEKS???, 
 * there are two longest substrings shown in the below diagrams, with length 7.
 * @author sjohari
 *
 */
public class LengthOfLongestSubstring {

	static int hash[];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int t=0;t<testCase;t++){
			hash = new int[150];

			String A = sc.next();
			int n = A.length();
			int start=0;
			int maxStart = 0;
			int l=0;
			int maxlength = -1;
			int i=0;
			
			while(i<n){
				if(hash[A.charAt(i)] != 1){
					hash[A.charAt(i)] = 1;
					i++;
				}
				else if(A.charAt(start) ==A.charAt(i)){
					l = i-start;
					if(l>maxlength){
						maxlength = l;
						maxStart = start;
					}
					start++;
					i++;
				}
				else{
					l=i-start;
					if(l>maxlength){
						maxlength = l;
						maxStart = start;
					}
					hash[A.charAt(start)]--;
					start++;
				}
			}
			
			l= i-start;
			if(l>maxlength){
				maxlength = l;
				maxStart = start;
			}
			
			for(int j=maxStart;j<maxStart+maxlength;j++){
				System.out.print(A.charAt(j));
			}
			//System.out.println(maxlength);
			
		}

	}

}
