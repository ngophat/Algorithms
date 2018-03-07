package Staircase;

import java.util.Scanner;

public class Solution {
	static void staircase(int n) {
        // Complete this function
		for(int i=0;i<n;i++) {		
			StringBuilder b = new StringBuilder();
			for(int j=0;j<n;j++) {			
				
				if(j>=n-1-i) {
					b.append("#");
				}else {
					b.append(" ");
				}
			}
			System.out.println(b);
		}
   }

   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       staircase(n);
       in.close();
   }
}
