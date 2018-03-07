package Super_Reduced_String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	static StringBuilder super_reduced_string(String s){
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++) {
        	list.add(s.charAt(i));
        }
        for(int i=0;i<list.size()-1;) {
        	if(list.get(i).equals(list.get(i+1))) {
        		list.remove(i);
        		list.remove(i); 
                if(i>0) {
        			i--;
        		}
        	}else {
        		i++;
        	}
        }
        StringBuilder a = new StringBuilder();
        if(list.isEmpty()) {
        	a.append("Empty String");
        }else {
        	for(int i=0;i<list.size();i++) {
            	a.append(list.get(i));
            }
        }     
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(super_reduced_string(s));
    }
}
