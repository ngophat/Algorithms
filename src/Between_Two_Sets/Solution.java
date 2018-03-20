package Between_Two_Sets;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	/*
	 * Complete the getTotalX function below.
	 */
	static void getTotalX(int[] a, int[] b) {
		// Write your code here.
		//min of array b
		int minB = b[0];
		for(int i = 1;i<b.length;i++) {
			if(b[i] < minB) 	minB = b[i];
		}
		//max of array a
		int maxA = a[0];
		for(int i = 1;i<a.length;i++) {
			if(a[i]>maxA) 	maxA = a[i];
		}	
		//the number divide for each element of array a < minB
		List<Integer> listMaxA = new ArrayList<>();
		int max=maxA;
		for(int i = 2;max<=minB;i++) {
			listMaxA.add(max);
			max=maxA*i;
		}
		List<Integer> listNeed = new ArrayList<>();
		for(int i=0;i<listMaxA.size();i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(listMaxA.get(i)%a[j]==0) {
					count++;
				}else {
					break;
				}
				if(count == a.length) {
					listNeed.add(listMaxA.get(i));
				}
			}
		}
		//Let finish it
		int iCount=0;
		for(int i=0;i<listNeed.size();i++) {
			int count=0;
			for(int j=0;j<b.length;j++) {
				if(b[j]%listNeed.get(i)==0) {
					count++;
				}else {
					break;
				}
				if(count == b.length) {
					iCount++;
				}
			}
		}
		System.out.println(iCount);
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] a = new int[n];
		for (int aItr = 0; aItr < n; aItr++) {
			a[aItr] = scan.nextInt();
		}
		int[] b = new int[m];
		for (int bItr = 0; bItr < m; bItr++) {
			b[bItr] = scan.nextInt();
		}
		getTotalX(a, b);
	}
}
