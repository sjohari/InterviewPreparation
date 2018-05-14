package Data_Structures.HashAndArray;

import java.util.Scanner;
import java.util.Stack;

public class StockSellBuyByStack {

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
			//	System.out.print(A[j] + " ");
			}
			
			Stack<Integer> s = new Stack<Integer>();
			
			int x=0;
			while(x<n){
				if(s.empty()){
					s.push(x);
					x++;
					continue;
				}
				if(!s.empty() && A[s.peek()] <= A[x]){
					s.push(x);
					
				}else{
					int r = s.peek();
					int l = r;
					int t = A[r];
					s.pop();
					while(!s.empty() && A[s.peek()] < t){
						l = s.pop();
						t = A[l];	
					}
					if(r>l){
					    System.out.print("(" +l + " " + r + ") ");
					    count++;
					}
					s.push(x);
				}
				
				x++;
				
			}

			
			int r=-1;
			int l=-1;
			if(!s.empty()){
				r=s.pop();
				l=r;
			}
			while(!s.empty()){
				l=s.pop();
			}
			if(l!=r){
				System.out.print("(" +l + " " + r + ")");
				count++;
			}
			if(count ==0)
			    System.out.println("No Profit");
		    else
		        System.out.println();
		}


	
	}

}
