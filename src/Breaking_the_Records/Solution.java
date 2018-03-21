package Breaking_the_Records;

import java.util.Scanner;

public class Solution {
	static int[] breakingRecords(int[] score) {
		/*
		 * Write your code here.
		 */
		int max=score[0];
		int min=score[0];
		int maxCount=0;
		int minCount=0;
		for(int i=0;i<score.length;i++) {
			if(score[i]>max) {
				max = score[i];
				maxCount++;
				continue;
			}
			if(score[i]<min) {
				min = score[i];
				minCount++;
			}
		}
		int[] arr  = {maxCount,minCount};
		return arr;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scan.nextInt();
		int[] score = new int[n];
		for (int scoreItr = 0; scoreItr < n; scoreItr++) {
			score[scoreItr] = scan.nextInt();
		}
		int[] result = breakingRecords(score);
		for (int resultItr = 0; resultItr < result.length; resultItr++) {
			System.out.print(result[resultItr]+" ");
		}
	}
}
