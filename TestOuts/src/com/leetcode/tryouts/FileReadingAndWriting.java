package com.leetcode.tryouts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FileReadingAndWriting {
	
	public static void main(String[] stringInputs) throws IOException {
		FileWriter fileWriter = new FileWriter("storing",true);
		List<String> inputStringList = new ArrayList<String>();
		inputStringList =  Arrays.asList(stringInputs);
		inputStringList.forEach(x -> {
			try {
				System.out.println("Going for write--"+ x);
				fileWriter.write("\n");
				fileWriter.write(x);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		fileWriter.close();
		
		FileReader reader = new FileReader("storing");
		BufferedReader fileIpBufferedReader = new BufferedReader(reader);
		while(fileIpBufferedReader.readLine()!=null) {
			System.out.println(fileIpBufferedReader.readLine());
		}
		reader.close();
	}

}
