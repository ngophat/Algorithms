package Cats_and_a_Mouse;

import java.util.Scanner;

public class Solution {
    static String catAndMouse(int x, int y, int z) {
        String result = "";
        int a = Math.abs(z-x);
        int b = Math.abs(z-y);
        if(a>b)	result = "Cat B";
        else if(a<b)  result = "Cat A";
        else  result = "Mouse C";
        return result;
    }


    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        int q = scan.nextInt();

        for (int i=0; i < q; i++) {

            int x = scan.nextInt();

            int y = scan.nextInt();

            int z = scan.nextInt();

            String result = catAndMouse(x, y, z);
            System.out.println(result);
        }
    }
}
