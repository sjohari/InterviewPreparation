package Data_Structures.DynamicProgramming;

public class FindAllPermutations {

	
	
	public static void main(String[] args) {
		int a[] = {1,2,2};
		printAllPermutations(a , 0 , a.length-1);
	}

	private static void printAllPermutations(int[] a ,int l , int r) {
		if(l>=r){
			print(a);
			System.out.println();
			return;
		}
		for(int i=l;i<=r;i++){
			swap(a, i,l);
			printAllPermutations(a ,l+1 ,r);
			swap(a, l,i);
		}
		
	}

	private static void swap(int a[] , int i, int l) {
		int t=a[i];
		a[i] = a[l];
		a[l] = t;
		
	}

	private static void print(int[] a) {
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
		
	}

}
