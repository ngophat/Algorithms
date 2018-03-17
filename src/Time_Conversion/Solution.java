package Time_Conversion;

import java.util.Scanner;

public class Solution {
	static String timeConversion(String s) {
        // Complete this function
		String timeConvert="";
		String typeTime = s.substring(8, 10);
		String hour = s.substring(0, 2);
		String minuteVsSecond =  s.substring(2, 8);
		String dontNeedConvert = s.substring(0, 8);
		//AM: 12:00:00AM => 00:00:00
		if(typeTime.equalsIgnoreCase("AM")) {
			if(hour.equals("12")) {
				timeConvert = "00"+minuteVsSecond;
			}else {
				timeConvert = dontNeedConvert;
			}
		}
		//PM: 12:00:00PM => 12:00:00
		else if(typeTime.equalsIgnoreCase("PM")) {
			if(hour.equals("12")) {
				timeConvert = dontNeedConvert;
			}else {
				String  newHour = String.valueOf((Integer.parseInt(hour) + 12));
				timeConvert = newHour + minuteVsSecond;
			}
		}
		return timeConvert;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
