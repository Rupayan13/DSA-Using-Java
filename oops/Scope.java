/**
 * 
 */
package oops;

/**
 * @author Rupayan Dirghangi
 *
 */
class Algebra1{
//	int a=10;
//	int b=8;
//	int add() {
//		int p=12;
//		int q=10;
//		return p+q;
//	}
//	int sub() {
//		return a-b;
//	}
	void demo() {
		int a=5;
		System.out.println(a);
//		System.out.println(b);//It can't acessable
		{
			int b=10;
			System.out.println(b);
		}
		{
			int b=100;
			System.out.println(b);
		}
	}
}
public class Scope {

	/**
	 * @param args
	 */
	public static void changeValue(int a) {
		a*=100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Algebra1 obj= new Algebra1();
//		obj.demo();
		
		int a=10;
		System.out.println("Before changing value :"+a);
		changeValue(a);
		System.out.println("After changing value :"+a);

	}

}
