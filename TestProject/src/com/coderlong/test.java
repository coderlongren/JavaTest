package com.coderlong;

public class test {

	public static void main(String[] args) throws Exception {
		// weekdays day1 = weekdays.MON;
		// weekdays day2 = weekdays.SUN;
		// System.out.println(day1);
		// System.out.println(day1.nextday());
		// System.out.println(day2);
		// System.out.println(day2.nextday());
		String st1 = "abc";
		Class class1 = st1.getClass();
		Class class2 = String.class;
		Class class3 = Class.forName("java.lang.String");
		System.out.println(class1 == class2);
		System.out.println(int.class.isPrimitive());
		System.out.println(String.class.isPrimitive());

	}

}
