package Divisible_Sum_Pairs;

import java.util.Scanner;

public class Solution {
	static int divisibleSumPairs(int n, int k, int[] ar) {
        // Complete this function
        int count=0;
        int sum=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                sum=ar[i] + ar[j];
                if(sum%k==0) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}
