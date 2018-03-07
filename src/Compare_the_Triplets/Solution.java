package Compare_the_Triplets;

import java.util.Scanner;

public class Solution {

    static void solve(int[] iAlice, int[] iBob){
        int aliceCount = 0;
        int bobCount = 0;
        
        for(int i=0;i<iAlice.length;i++){
            if(iAlice[i] > iBob[i]){
                aliceCount = aliceCount + 1;
            }else if(iAlice[i] < iBob[i]){
                bobCount = bobCount + 1;
            }
        }
        System.out.println(aliceCount+" "+bobCount);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        int[] iAlice = {a0,a1,a2};
        int[] iBob = {b0,b1,b2};
        
        solve(iAlice,iBob);
    }
}
