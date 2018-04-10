package Bon_Appétit;

import java.util.Scanner;

public class Solution {
	private static void testSplit(int n, int k, int[] bill, int b) {
		int splitTotalCost=0;
		for(int i=0;i<n;i++) {
			if(i!=k) {
				splitTotalCost = splitTotalCost +bill[i];
			}
		}
		int splitTotalCostHalf = splitTotalCost/2;
		int refundMoney=b-splitTotalCostHalf;
		String s = "Bon Appetit";
		if(refundMoney>0) 	System.out.println(refundMoney);
		else 	System.out.println(s);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] bill = new int[n];
		for(int i=0;i<n;i++)		bill[i] = scan.nextInt();
		int b = scan.nextInt();
		
		testSplit(n,k,bill,b);
	}
}
