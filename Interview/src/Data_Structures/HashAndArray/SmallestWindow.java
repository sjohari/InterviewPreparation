package Data_Structures.HashAndArray;

import java.util.Hashtable;
import java.util.Scanner;

public class SmallestWindow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int i=0;i<testCase;i++){
			String T = sc.next();
			String S = sc.next();

			Hashtable<Character,Integer> hash = 
					new Hashtable<Character,Integer>();
			for(int j=0;j<S.length();j++){
				hash.put(S.charAt(j) , 1);
			}
			int count = 0;
			int start =-1;
			int end = -1;
			int temp[] = new int[T.length()];
			int t=0;
			for(int j=0;j<T.length();j++){
				if(hash.get(T.charAt(j)) != null){
					temp[t] = j;
					t++;
				}
			}

			for(int j=0;j<T.length();j++){
				if(hash.get(T.charAt(j)) != null){
					if(hash.get(T.charAt(j)) >= 1){
						int x = hash.get(T.charAt(j)) - 1;
						hash.put(T.charAt(j), x);
						count++;
						if(count == S.length()){
							end = j;
							break;
						}
						if(count==1){
							start = j;
						}
					}
				}
			}
			System.out.println();
			System.out.println("start= "+ start);
			System.out.println("end= "+ end);
			int min = end-start+1;
			int t1=0;
			for(int j=end+1;j<T.length();j++){
				if(T.charAt(j)==T.charAt(start)){
					int x = hash.get(T.charAt(j)) + 1;
					hash.put(T.charAt(j), x);
					end = j;
					if(j==10){
						System.out.println("start=fwfnwelk ");
					}
					while((x >= 1 || T.charAt(j)==T.charAt(start)) && t1<t && hash.get(T.charAt(start)) != null){
						x--;
						hash.put(T.charAt(j), x);
						t1++;
						start=temp[t1];
						if(hash.get(T.charAt(start)) !=null){
						    x = hash.get(T.charAt(start));
						}
						System.out.println("start= "+ start);
						System.out.println("end= "+ end);
						if(min==4){
							for(int k=0;k<S.length();k++){
								System.out.print(hash.get(S.charAt(k)) + " ");
							}
						}
						if(min > (end-start+1)){
							min = (end-start+1);
						}
					}

				}else{
					if(hash.get(T.charAt(j)) != null){
						int x = hash.get(T.charAt(j)) + 1;
						hash.put(T.charAt(j), x);
					}
				}
			}
			System.out.println(min);
		}


	}

}
