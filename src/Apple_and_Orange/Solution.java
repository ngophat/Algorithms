package Apple_and_Orange;

import java.util.Scanner;

public class Solution {
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		// Complete this function
		int countApples = 0;
		int countOranges = 0;
		int[] positionOfApple = new int[apples.length];
		int[] positionOfOrange = new int[oranges.length];
		// The position of apples
		for (int i = 0; i < apples.length; i++) {
			positionOfApple[i] = a + apples[i];
			if(positionOfApple[i]>=s && positionOfApple[i]<=t) {
				++countApples;
			}
		}
		// The position of oranges
		for (int i = 0; i < oranges.length; i++) {
			positionOfOrange[i] = b + oranges[i];
			if(positionOfOrange[i]>=s && positionOfOrange[i]<=t){
				++countOranges;
			}
		}
		System.out.println(countApples);
		System.out.println(countOranges);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// a<s<t<b
		int s = in.nextInt(); // The start point of Sam's house
		int t = in.nextInt(); // The endpoint of Sam's house
		int a = in.nextInt(); // the location of the apple tree
		int b = in.nextInt(); // the location of the orange tree
		int m = in.nextInt(); // the number of apple that fell
		int n = in.nextInt(); // the number of orange that fell from the tree
		int[] apple = new int[m]; // all the location of the apple
		for (int apple_i = 0; apple_i < m; apple_i++) {
			apple[apple_i] = in.nextInt();
		}
		int[] orange = new int[n]; // all the location of the orange
		for (int orange_i = 0; orange_i < n; orange_i++) {
			orange[orange_i] = in.nextInt();
		}
		countApplesAndOranges(s, t, a, b, apple, orange);
		in.close();
	}
}
