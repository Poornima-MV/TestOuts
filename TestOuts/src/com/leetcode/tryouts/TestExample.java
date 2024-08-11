package com.leetcode.tryouts;

import java.text.SimpleDateFormat;
import java.util.*;

public class TestExample {
	public static void main(String[] inputs) throws InterruptedException {
		Arrays.asList(inputs).stream().forEach(x-> System.out.println(x));
		char[] charArray = {'z','y','x','d'};
		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("zzzzzz");
		stringList.add("xyz");
		stringList.sort(Comparator.naturalOrder());
		stringList.stream().forEach(x-> System.out.println(x));
		Arrays.sort(charArray);
		Arrays.asList(charArray).stream().forEach(x-> System.out.println(x));
		
		ArrayList<Calendar> timeList = new ArrayList<Calendar>();
		timeList.add(new GregorianCalendar(2017, 01, 01));
		timeList.add(new GregorianCalendar(2018, 01, 01));
		timeList.add(new GregorianCalendar(2019, 01, 01));
		timeList.add(new GregorianCalendar(2024, 01, 01));
		
		timeList.add(new GregorianCalendar(2013, 01, 01));
		timeList.sort(Comparator.naturalOrder());
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy::HH::mm::ss Z");
		timeList.stream().forEach(x-> System.out.println(dateFormat.format(x.getTime())));
		
		
		ArrayList<StudentDetails> studentList = new ArrayList<>();
		studentList.add(new StudentDetails("Poornima", new GregorianCalendar(1988, 9, 27)));
		studentList.add(new StudentDetails("Jibin", new GregorianCalendar(1989, 4, 4)));
		Collections.sort(studentList, (s1,s2) -> (s1.getName().compareTo(s2.getName())));
		studentList.stream().forEach(x-> System.out.println(x.toString()));
		
		Float floatValue  = 0.2323434435435435F;
		Double doubleValue = 0.234685800983;
		Math.ceil(0.23);
		System.out.println(Math.scalb(doubleValue, 2));
		System.out.println(String.format("%.5f", doubleValue));
		// time output
		int clockTicking = 0;
		while(clockTicking <=10) {
			Date date = new Date(System.currentTimeMillis());
			System.out.println(dateFormat.format(date));
			Thread.sleep(1000);
			clockTicking++;
		}
	}

}

class StudentDetails {
	
	String name;
	Calendar dateOfBirth;
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy::HH::mm::ss Z");
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "StudentDetails [name=" + name + ", dateOfBirth=" + dateFormat.format(dateOfBirth.getTime())  + "]";
	}
	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public StudentDetails(String name, Calendar dateOfBirth) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	
}
