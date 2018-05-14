package Data_Structures.HashAndArray;

public class DutchNationalFlagProblem {

	/**
	 * Sort an array of 0s, 1s and 2s
	 */
	public static void main(String[] args) {
		int a[] = {0, 1, 1, 0, 2, 2, 1, 2, 1, 2, 0, 0, 0, 1};
		sort(a);
	}

	private static void sort(int[] a) {
		int mid=0;
		int low=0;
		int high = a.length-1;
		while(mid<=high){
			if(a[mid] == 0){
				swap(a, low , mid);
				low++;
				mid++;
			}
			else if(a[mid]==1){
				mid++;
			}
			else{
				swap(a, high , mid);
				high--;
			}
		}
		print(a);
		
	}

	private static void print(int[] a) {
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + " ");
		}
		
	}

	private static void swap(int a[], int i, int j) {
		int t = a[i];
		a[i]=a[j];
		a[j]=t;
		
	}

}
