/**
 * 
 */
package oopsInJava;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class StudentClass {
	// creating a new data type with multiple attributes
	public static class Student {
		String name;
		int rno;
		double percentage;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.name="Rupayan";
		s1.rno=47;
		s1.percentage=9.446;
		System.out.println(s1.name);
		System.out.println(s1.rno);
		System.out.println(s1.percentage);
		
		Student s2=new Student();
		s2.name="Akshit";
		s2.percentage=9.81;
		s2.rno=3;

	}

}
