/**
 * 
 */
package conditionals;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year=sc.nextInt();
		if(year%4==0 && year%100==0)
		{
			System.out.println("The year is leap year");
		}
		else {
			System.out.println("The year is not leap year");
		}

	}

}
