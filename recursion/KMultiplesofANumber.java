/**
 * 
 */
package recursion;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class KMultiplesofANumber {
	public static void kMultiple(int num, int k) {
		//base case
		if(k==1) {
			System.out.println(num);
			return;
		}
		//sub problems
		kMultiple(num, k-1);
		//self work
		System.out.println(num*k);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int k=sc.nextInt();
		kMultiple(num, k);

	}

}
