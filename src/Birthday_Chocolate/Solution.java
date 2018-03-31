package Birthday_Chocolate;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static int solve(int n, int[] s, int d, int m) {
		// Complete this function
		int sum = 0;
		for (int i = 0; i <= n-m; i++) {
			if(Arrays.stream(s, i, i+m).sum()==d) {
				sum++;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		for (int s_i = 0; s_i < n; s_i++) {
			s[s_i] = in.nextInt();
		}
		int d = in.nextInt();
		int m = in.nextInt();
		int result = solve(n, s, d, m);
		System.out.println(result);
	}
}
