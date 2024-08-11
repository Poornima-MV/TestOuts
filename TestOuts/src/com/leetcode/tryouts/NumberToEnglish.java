package com.leetcode.tryouts;
import java.util.HashMap;

/**
 * Convert a non-negative integer num to its English words representation. Q no
 * - 273
 * 
 * @author Poornima Vadakeyil Example 1:
 * 
 *         Input: num = 123 Output: "One Hundred Twenty Three" Example 2:
 * 
 *         Input: num = 12345 Output: "Twelve Thousand Three Hundred Forty Five"
 *         Example 3:
 * 
 *         Input: num = 1234567 Output: "One Million Two Hundred Thirty Four
 *         Thousand Five Hundred Sixty Seven"
 *
 */
//Solution need to be refined
public class NumberToEnglish {
	
	public static void main(String[] args) {
		int numToTesst = 123;
		System.out.println("Answer ---"+ numberToWords(numToTesst));
	}

	private static String numberToWords(int numToTesst) {


        HashMap<String, String> numberWordsMapping = new HashMap<String, String>();
        numberWordsMapping.put("1", "One");
        numberWordsMapping.put("2", "two");
        numberWordsMapping.put("3", "Three");
        numberWordsMapping.put("4", "Four");
        numberWordsMapping.put("5", "Five");
        numberWordsMapping.put("6", "Six");
        numberWordsMapping.put("7", "Seven");
        numberWordsMapping.put("8", "Eight");
        numberWordsMapping.put("9", "Nine");

        HashMap<Integer, String> placeMapping = new HashMap<Integer, String>();
        placeMapping.put(0, "");
        placeMapping.put(1, "ty");
        placeMapping.put(2, "Hundred");
        placeMapping.put(3, "Thousand");
        String stringRep = Integer.toString(numToTesst);
        StringBuilder englishRep = new StringBuilder("");
        int length = stringRep.length();
        for (int i = 0; i < length; i++) {
        	
            englishRep.append(numberWordsMapping.get(String.valueOf(stringRep.charAt(i))) + placeMapping.get(i));
            englishRep.append( placeMapping.get(i+ (length-1)));
            englishRep.append("  and  ");
        }
        
        return englishRep.toString();
    }
	

}


