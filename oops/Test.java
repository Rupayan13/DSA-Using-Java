/**
 * 
 */
package oops;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
class Algebra {
	int a, b;

	Algebra(int x, int y) {
		a = x;
		b = y;
	}

	int add() {
		int ans = a + b;
		return ans;
	}

	int sub() {
		return a - b;
	}

	int mul() {
		return a * b;
	}
}

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algebra obj = new Algebra(5, 7);
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
		System.out.println("Sum of the inputs is:");
		int ans = obj.add();
		System.out.println(ans);

		System.out.println(Math.sqrt(24));
		System.out.println(Math.sqrt(16));

		System.out.println(Math.floor(5.3));
		System.out.println(Math.floor(5.8));

		System.out.println(Math.ceil(5.3));
		System.out.println(Math.ceil(5.8));

	}

}
