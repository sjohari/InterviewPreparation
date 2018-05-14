import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Comparator;

class UberCab implements Comparable<UberCab>{
    public int start;
    public int end;


	@Override
	public int compareTo(UberCab o) {
		return (this.start - o.start);
	}

}

public class Solution {
    
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        List<UberCab> cabList = new ArrayList<UberCab>(testCase);
        
        for(int t=0;t<testCase; t++){
            UberCab cab = new UberCab();
            
            cab.start = sc.nextInt();
            cab.end = sc.nextInt();
            cabList.add(cab);
        }
        
        if(cabList.isEmpty()){
            System.out.println("0");
        }
        
        Collections.sort(cabList);
        
        int x =  cabList.get(0).start, y = cabList.get(0).end;
        int count = 0 ;

        for(int t=1;t<testCase; t++){

            if(cabList.get(t).start <= y && cabList.get(t).end > y){
                y = cabList.get(t).end;
            }
            else{
                count = count + (y-x) + 1;
                x = cabList.get(t).start;
                y = cabList.get(t).end;
            }
        }

        count = count + (y-x);
        System.out.println(count);
    }
}