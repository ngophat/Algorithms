package Diagonal_Difference;

import java.util.Scanner;

public class Solution {
	static int diagonalDifference(int[][] a, int n) {
        // Complete this function
        int iSum=0;
        int jSum=0;
        int iResult=0;
        for(int i=0;i<n;i++) {
        	iSum = iSum + a[i][i];
            jSum = jSum +a[i][n-i-1];
        }
        iResult = iSum - jSum;
        if(iResult<0) {
        	iResult=iResult*(-1);
        }
        return iResult;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a,n);
        System.out.println(result);
        in.close();
    }
}
