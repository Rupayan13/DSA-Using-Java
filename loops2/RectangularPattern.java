/**
 * 
 */
package loops2;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class RectangularPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=2*row;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
