package com.leetcode.tryouts;
import java.util.*;

public class BubbleSort {
	
	public static void main(String[] stringArgs) {
		 int[] integerList  = new int[stringArgs.length];
		for(int i=0; i< stringArgs.length ;i++) {
			integerList[i] = Integer.valueOf(stringArgs[i]);
		}
		
		for(int outer=0 ; outer < (stringArgs.length-1) ; outer++ ) {
			
			boolean swapped =false;
			for(int inner=0 ; inner <  (stringArgs.length-outer-1) ; inner++ ) {
				int temp =0;
				int tempNext =0;
				if(integerList[inner]>integerList[inner+1]) {
					temp =integerList[inner];
					tempNext = integerList[inner+1];
					integerList[inner] =tempNext;
					integerList[inner+1] =temp;
					swapped =true;
				}
				
			}
			if(swapped==false) {
				break;
			}
		}
		
		Arrays.stream(integerList).forEach(x -> System.out.println(x));
		StringBuilder sb = new StringBuilder();
		Arrays.stream(stringArgs).forEach( x -> sb.append(x));
		System.out.println(sb);
	}

}
