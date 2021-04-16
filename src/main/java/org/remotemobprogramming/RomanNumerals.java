package org.remotemobprogramming;

public class RomanNumerals {

	public static String toRoman(int arabic) {
		String result = "";

		if(arabic >= 4) {
			arabic -= 5;
			result = "V";
		}

		if(arabic == 4) {
			return "IV";
		}

		for (int i = 1; i <= arabic; i++) {
			result=result + "I";
		}
		return result;
	}

}
