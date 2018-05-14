package Data_Structures.DynamicProgramming;

class MinHeap{
	int count;
	int minHeapArray[];

	MinHeap(int n){
		count = 0;
		minHeapArray = new int[n/2];
	}

	public void insert(int e) {
		minHeapArray[count] = e;
		if(count==0){
			count++;
			return;
		}
		int i = count;
		while(i>0){
			int parent = (i-1)/2;
			if(minHeapArray[i] < minHeapArray[parent]){
				int t= minHeapArray[i];
				minHeapArray[i] = minHeapArray[parent];
				minHeapArray[parent] = t;
			}
			i=parent;
		}
		count++;
	}

	public void delete() {
		if(count==1){
			count--;
			return;
		}
		minHeapArray[0] = minHeapArray[count-1];
		count--;
		int i = 0;
		while(i<= (count-1)/2){
			int left = i*2+1;
			int right = i*2 +2;
			int smallest = i;
			if(left < count && minHeapArray[left] < minHeapArray[smallest] ){
				smallest = left;
			}
			if(right < count && minHeapArray[right] < minHeapArray[smallest] ){
				smallest = right;
			}
			
			if(smallest != i){
				int t = minHeapArray[smallest];
				minHeapArray[smallest] = minHeapArray[i];
				minHeapArray[i] = t;
				i=smallest;
			}else{
				break;
			}
		}
		
	}
}

class MaxHeap{
	int count;
	int maxHeapArray[];

	MaxHeap(int n){
		count = 0;
		maxHeapArray = new int[n/2+1];
	}

	public void insert(int e) {
		maxHeapArray[count] = e;
		if(count==0){
			count++;
			return;
		}
		int i = count;
		while(i>0){
			int parent = (i-1)/2;
			if(maxHeapArray[i] > maxHeapArray[parent]){
				int t= maxHeapArray[i];
				maxHeapArray[i] = maxHeapArray[parent];
				maxHeapArray[parent] = t;
			}
			i=parent;
		}
		count++;
	}

	public void delete() {
		if(count==1){
			count--;
			return;
		}
		maxHeapArray[0] = maxHeapArray[count-1];
		count--;
		int i = 0;
		while(i<= (count-1)/2){
			int left = i*2+1;
			int right = i*2 +2;
			int largest = i;
			if(left < count && maxHeapArray[left] > maxHeapArray[largest] ){
				largest = left;
			}
			if(right < count && maxHeapArray[right] < maxHeapArray[largest] ){
				largest = right;
			}
			
			if(largest != i){
				int t = maxHeapArray[largest];
				maxHeapArray[largest] = maxHeapArray[i];
				maxHeapArray[i] = t;
				i=largest;
			}else{
				break;
			}
		}
		
	}

}

public class MedianInStreamOfIntegers {
	
	static MinHeap minHeap;
	
	static MaxHeap maxHeap;
	
	static float median = 0;
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};

		minHeap = new MinHeap(a.length);
		maxHeap = new MaxHeap(a.length);

		for(int i=0;i< a.length;i++){
			System.out.println(findMedian(a[i])) ;
		}

	}

	private static float findMedian(int e) {
		
		//this is first element
		if(minHeap.count == 0){
			minHeap.insert(e);
		}
		else if(e > median && (minHeap.count > maxHeap.count)){
			maxHeap.insert(minHeap.minHeapArray[0]);
			minHeap.delete();
			minHeap.insert(e);
		}
		else if(e < median && (minHeap.count < maxHeap.count)){
			minHeap.insert(maxHeap.maxHeapArray[0]);
			maxHeap.delete();
			maxHeap.insert(e);
		}
		else if(e <= median && (minHeap.count > maxHeap.count)){
			maxHeap.insert(e);
		}
		else if(e >= median && (minHeap.count < maxHeap.count)){
			minHeap.insert(e);
		}
		else if(e >= median){
			minHeap.insert(e);
		}
		else{
			maxHeap.insert(e);
		}
		
		if(minHeap.count > maxHeap.count){
			median =  minHeap.minHeapArray[0];
		}else if(maxHeap.count > minHeap.count){
			median =  maxHeap.maxHeapArray[0];
		}else{
			median = Float.valueOf((minHeap.minHeapArray[0] + maxHeap.maxHeapArray[0]))/2;
		}
		return median;
	}

}
