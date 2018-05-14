package Data_Structures.Stack;
/*
 * Given n non-negative integers in array representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
For example:
Input:
3
2 0 2
Output:
2
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TrappingRainWater {

	public static int trap(final List<Integer> A) {
        Stack<Integer> s = new Stack<Integer>();
        int left = 0;
        int ans = 0;
        for(Integer item:A){
            if(s.empty()){
                s.push(item);
                left = item;
            }else if(left > item){
                s.push(item);
            }
            else if(left <= item){
                while(!s.empty() && s.peek() <= item){
                    ans = ans + (left - s.peek());
                    s.pop();
                }
                left = item;
                s.push(item);
            }
            
        }
        
        if(!s.empty()){
            Integer item = s.pop();
            while(!s.empty()){
                if(!s.empty() && s.peek() >= item){
                    item = s.pop();
                }
                else if(!s.empty()){
                    ans = ans + (item - s.pop());
                }
                
            }
        }
        return ans;
    }
	
	public static void main(String[] args) {
		List<Integer> A = new ArrayList<Integer>();
		A.add(0);
		A.add(1);
		A.add(0);
		A.add(2);
		A.add(1);
		A.add(0);
		A.add(1);
		A.add(3);
		A.add(2);
		A.add(1);
		A.add(2);
		A.add(1);
		System.out.println(trap(A));
	}

}
