package Data_Structures.HashAndArray;

public class MergeOverlappingIntervals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int A[][] = {{5,7}, {6,8} ,{1,3}, {2,4} };
		for(int i=0;i<A.length;i++){
			int min = i;
			for(int j=i+1;j<A.length;j++){
				if(A[j][0] < A[min][0]){
					min = j;
				}
			}
			int t0=A[i][0];
			int t1=A[i][1];
			A[i][0]=A[min][0];
			A[i][1]=A[min][1];
			A[min][0] = t0;
			A[min][1] = t1;
		}	
		
//		for(int i=0;i<A.length;i++){
//			System.out.println(A[i][0] + " " + A[i][1]);
//		}
		
		int l=A[0][0];
		int r = A[0][1];
		for(int i=1;i<A.length;i++){
			if(A[i][0] > r){
				System.out.println("{ " + l + "," + r + "}");
				l=A[i][0];
			}
			if(A[i][1] > r) {
				r=A[i][1];
			}
		}
		System.out.println("{ " + l + "," + r + "}");
		
	}

}
