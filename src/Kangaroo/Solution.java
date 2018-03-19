package Kangaroo;

import java.util.Scanner;

public class Solution {
	static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
		/*if x1 = x2 then v1 = v2 => yes
		 * if x1 > x2 then v2 > v1 => yes or no else no
		 * if x1 < x2 then v2 < v1 = > yes or no else no
		 */
		String result="";
		if(x1 == x2) {
			if(v1 == v2) result = "YES";
			else result = "NO";
		}else if(x1 > x2) {
			if(v2>v1) {
				while(x2 < x1) {
					x1 = x1 + v1;
					x2 = x2 + v2;
				}
				if(x2==x1) result = "YES";
				else result = "NO";
			}else result = "NO";			
		}else {
			if(v2<v1) {
				while(x1 < x2) {
					x1 = x1 + v1;
					x2 = x2 + v2;
				}
				if(x2==x1) result = "YES";
				else result = "NO";
			}else result = "NO";
		}
		return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Location and meters per jump of the kangaroo 1
        int x1 = in.nextInt();
        int v1 = in.nextInt();
      //Location and meters per jump of the kangaroo 2
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
