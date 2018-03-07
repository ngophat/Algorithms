package Plus_Minus;

import java.util.Scanner;

public class Solution {
	static void plusMinus(int[] arr) {
        // Complete this function
        int pCount=0;
		int nCount=0;
		int zCount=0;
		float pResult;
		float nResult;
		float zResult;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > 0) {
				pCount=pCount+1;
			}else if(arr[i] < 0) {
				nCount=nCount+1;
			}else {
				zCount=zCount+1;
			}
		}
		pResult=(float) pCount/arr.length;
		nResult=(float) nCount/arr.length;
		zResult=(float) zCount/arr.length;
		System.out.println(pResult);
		System.out.println(nResult);
		System.out.println(zResult);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
