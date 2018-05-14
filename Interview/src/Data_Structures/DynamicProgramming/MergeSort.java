package Data_Structures.DynamicProgramming;

public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {12,11,13,5,6,7};

		mergesort(a , 0 , a.length-1);

		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + " ");
		}

	}

	private static void mergesort(int[] a,int start, int end) {

		if(start==end){
			return;
		}
		int mid = (start+end)/2;


		mergesort(a,start,mid);
		mergesort(a,mid+1,end);

		merge(a,start,mid, mid+1,end);

	}

	private static void merge(int[] a, int start1, int end1, int start2, int end2) {

		while(start1<=end1){
			if(a[start1] > a[start2]){
				int t= a[start1];
				a[start1] = a[start2];
				int x=start2;
				x++;
				while(x<=end2 && t > a[x]){
					a[x-1] = a[x];
					x++;
				}
				a[x-1] = t;
			}
			else{
				start1++;
			}
		}
	}

}
