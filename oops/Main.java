/**
 * 
 */
package oops;

/**
 * @author Rupayan Dirghangi
 *
 */
class Student{
	int rollNo;
	String studentName;
}
public class Main {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1=new Student();
		Student obj2=new Student();
		obj1.rollNo=1;
		obj1.studentName="Rohan";
		obj2.rollNo=2;
		obj2.studentName="Rahul";
		System.out.println(obj1.rollNo);
		System.out.println(obj1.studentName);
		System.out.println(obj2.rollNo);
		System.out.println(obj2.studentName);

	}

}
