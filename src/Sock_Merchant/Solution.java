package Sock_Merchant;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static int sockMerchant(int n, int[] ar) {
        // Complete this function
		Arrays.sort(ar);
		int count = 0;
		int i=0;
		while(i<n-1) {
			if(ar[i]==ar[i+1])	{
				count++;
				i=i+2;
			}else {
				i++;
			}
		}
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
