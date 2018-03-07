package Mini_Max_Sum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	static void miniMaxSum(long[] arr) {	
		List<Long> list = new ArrayList<>();
		
        for(int i=0;i<arr.length;i++) {
        	long iSum=0;
        	for(int j=0;j<arr.length;j++) {
        		if(j!=i) {
        			iSum=iSum + arr[j];
        		}
        	}
        	list.add(iSum);
        }
        long iMax=list.get(0);
        long iMin=list.get(0);
        for(int i=1;i<list.size();i++) {
        	if(list.get(i)>iMax) {
        		iMax=list.get(i);
        	}
        	if(list.get(i)<iMin) {
        		iMin = list.get(i);
        	}
        }
        System.out.println(iMin+" "+iMax);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
