package Data_Structures.DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class MinBinaryOnes {

	static int binary_ones[];
	static int count;

	static void calculateOneForPowerOfTwo(int max){
		int sum  = 1;
		while(sum < max){
			sum = sum*2;
			if(sum < 1000000000){
				binary_ones[sum] = 1;
			}
		}
	}

	static int calculateOne(int num){
		int sum  = 1;
		while(sum < num){
			sum = sum*2;
		}
		sum=sum/2;
		count++;
		num = num-sum;
		if(binary_ones[num] > 0){
			count = (int) (count + binary_ones[num]);
			return count;
		}else{
			calculateOne(num);
		}
		return count;

	}

	public static void main(String args[] ) throws Exception {
		count = 0;
		int N, Q;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();	
		Q = sc.nextInt();
		
		int[] A = new int[N];
		int max = -1;

		for(int i=0;i<N;i++){
			A[i]= sc.nextInt();
			if(max < A[i]){
				max = A[i];
			}
		}
		
        binary_ones = new int[max+1];
		binary_ones[0] = 0;
		binary_ones[1] = 1;
		calculateOneForPowerOfTwo(max);
		int B[] = new int[N];
		for(int i=0;i<N;i++){
			if(!(binary_ones[A[i]] > 0)){
				binary_ones[A[i]] = calculateOne(A[i]);
				count=0;
			}
			B[i] = binary_ones[A[i]];
		}

		Arrays.sort(B , 0, N);

// 		for(int i=0;i<N;i++){
// 			System.out.print(B[i] + " ");
// 		}
        int QArray[] = new int[Q];
        max=-1;
        for(int i=0;i<Q;i++){
			QArray[i]= sc.nextInt();
			if(max < QArray[i])
			    max = QArray[i];

		}
        
        List<Integer> ans = new ArrayList<Integer>();

        int matrix[][]= new int[N][N];
        
        for(int i=0;i<N;i++){
            for(int j=i;j < N;j++){
                if(i==j){
                    matrix[i][j]= B[j];
                }else{
                    matrix[i][j]= matrix[i][j-1] + B[j];
                }
                
                if(!(ans.get(matrix[i][j]) > 0) ){
                    ans.add(matrix[i][j], j-i+1);
                }
                else if(ans.get(matrix[i][j])  > (j-i+1)){
                	ans.add(matrix[i][j], j-i+1);
                }
                
            }
        }
        for(int i=0;i<Q;i++){
            if(ans.get(QArray[i]) > 0 )
                System.out.println(ans.get(QArray[i]));
            else
                System.out.println("-1");
        }
			


	}

}
