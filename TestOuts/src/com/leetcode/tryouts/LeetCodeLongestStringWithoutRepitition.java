package com.leetcode.tryouts;
import java.util.*;

public class LeetCodeLongestStringWithoutRepitition {
	
	

	static Integer length;
	public static void main(String[] inputStrings) {
		OuterClass outerClass = new OuterClass();
		outerClass.getHashMapHolder();
		char[] charArrayFromIp = inputStrings[0].toCharArray();
		int pointer =1;
		length= charArrayFromIp.length;
		ArrayList<String> subStringInLoop = new ArrayList<String>();
		ArrayList<String> resultSubString = new ArrayList<String>();
		char now = charArrayFromIp[0];
		char next = charArrayFromIp[pointer];
		for(int index=0; index < charArrayFromIp.length ; index++) {
			if(pointer >=length-1) {
				break;
			}
			
			if (next!=now) {
				if(index==0) {
					subStringInLoop.add(String.valueOf(now));
					subStringInLoop.add(String.valueOf(next));
					pointer = pointer+1;
					if(pointer >= length-1) {
						break;
					}
					now = charArrayFromIp[pointer];
					next = charArrayFromIp[pointer+1];
					
				}else {
					subStringInLoop.add(String.valueOf(now));
					
					pointer = pointer+1;
					if(pointer >= length-1) {
						break;
					}
					now = charArrayFromIp[pointer];
					next = charArrayFromIp[pointer+1];
					
				}
			}else {
				if(subStringInLoop.size()>resultSubString.size()) {
					resultSubString.removeAll(resultSubString);
					resultSubString.addAll(subStringInLoop);
					pointer = pointer+1;
					if(pointer >=length-1) {
						break;
					}
					now = charArrayFromIp[pointer];
					next = charArrayFromIp[pointer+1];
				}
				break;
			}
			
		}
		System.out.println("Input String "+String.valueOf(charArrayFromIp));
		if(!resultSubString.isEmpty()) {
		System.out.println("Longest non repeating substring is "+ String.valueOf(resultSubString.toString()));
		}else {
			System.out.println("Longest non repeating substring is "+String.valueOf(subStringInLoop.toString()));
		}
	}
	

}

class OuterClass {

	HashMap<String, String> hashMapHolder = new HashMap<String, String>();

	public HashMap<String, String> getHashMapHolder() {
		return hashMapHolder;
	}

	public void setHashMapHolder(HashMap<String, String> hashMapHolder) {
		this.hashMapHolder = hashMapHolder;
	}

}



