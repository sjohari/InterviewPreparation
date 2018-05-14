package Data_Structures.HackerTest;

import java.util.Scanner;

public class findAlphabets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String inputString = s.nextLine();                 // Reading input from STDIN
		// System.out.println("Hi, " + inputString + ".");    // Writing output to STDOUT
		int hash[] = new int[26];
		for(int i=0;i<inputString.length();i++){
			if(inputString.charAt(i)>='a' && inputString.charAt(i)<='z' ){
				hash[inputString.charAt(i)-97]++;
			}
			else if(inputString.charAt(i)>='A' && inputString.charAt(i)<='Z' ){
				hash[inputString.charAt(i)-65]++;
			}
		}
		for(int i=0;i<26;i++){
			System.out.print(hash[i]);
		}

	}

}
