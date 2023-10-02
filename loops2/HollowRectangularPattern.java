/**
 * 
 */
package loops2;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class HollowRectangularPattern {

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
			if(i==1 || i==row)
			{
				for(int j=1;j<=2*row;j++)
				{
					System.out.print("*");
				}
			}
			else {
				System.out.print("*");
				for(int space=1;space<=2*(row-1);space++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
