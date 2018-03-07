package Two_Characters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
	static int twoCharaters(String s) {
        char[] ch = s.toCharArray();
		List<String> firstList= new ArrayList<>();
		for(int i=0;i<ch.length; i++) {
			firstList.add(String.valueOf(ch[i]));
		}	
		//Sort listStrings
		Arrays.sort(ch);
		List<String> listStringS= new ArrayList<>();
		for(int i=0;i<ch.length; i++) {
			listStringS.add(String.valueOf(ch[i]));
		}	
		//simplify listStrings
		for(int i=0;i<listStringS.size()-1;) {
			if(listStringS.get(i).equals(listStringS.get(i+1))) {
				listStringS.remove(i);
			}else {
				i++;
			}
		}
		int iResult=0;
		//listRandom = t's case valid
		List<List<String>> realList = new ArrayList<>();
		List<Integer> listMax = new ArrayList<>();
		if(listStringS.size()>1) {
			for(int i=0;i<listStringS.size()-1;i++) {
				for(int j=i+1;j<listStringS.size();j++) {
					List<String> fakeList = new ArrayList<>();
					fakeList.add(listStringS.get(i));
					fakeList.add(listStringS.get(j));
					List<String> list1 = new ArrayList<>();
					List<String> list2 = new ArrayList<>();
					list1.addAll(listStringS);
					list2.addAll(firstList);
					list1.removeAll(fakeList);
					list2.removeAll(list1);
					realList.add(list2);
				}
			}
			
			for(int i=0;i<realList.size();i++) {
				for(int j=0;j<realList.get(i).size()-1;) {
					if(realList.get(i).get(j).equals(realList.get(i).get(j+1))){
						break;
					}else {			
						j++;
						if(j==realList.get(i).size()-1) {
							listMax.add(realList.get(i).size());
						}
					}
				}
			}
			if(listMax.size()>0) {
				iResult = listMax.get(0);
				for(int i=1;i<listMax.size();i++) {
					if(listMax.get(i) >iResult) {
						iResult = listMax.get(i);
					}
				}
			}		
		}
		return iResult;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String s = in.next();
        int result = twoCharaters(s);
        System.out.println(result);
        in.close();
    }
}
