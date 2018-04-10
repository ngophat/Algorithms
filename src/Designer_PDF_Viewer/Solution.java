package Designer_PDF_Viewer;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	static HashMap<Character, Integer> map = new HashMap<>();
	static int designerPdfViewer(String word) {
        // Complete this function
		int area;
		int max = map.get(word.charAt(0));
		for(int i=1;i<word.length();i++) {
			if(map.get(word.charAt(i))>max) {
				max = map.get(word.charAt(i));
			}
		}
		area = word.length() * max;
		return area;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] s = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] h = new int[26];
        for(int i = 0; i < 26; i++){
            h[i] = in.nextInt();
            map.put(s[i], h[i]);
        }
        String word = in.next();
        int result = designerPdfViewer(word);
        System.out.println(result);
    }
}
