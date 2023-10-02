/**
 * 
 */
package numberSystem;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class DecimalToBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal number :");
		int decimal_number=sc.nextInt();
		
		int ans=0;//binary number
		int pw=1; //10^0
		while(decimal_number>0)
		{
			int parity=decimal_number%2;
			ans+=(parity*pw);
			decimal_number/=2;
			pw*=10;
		}
		System.out.println("The binary number is "+ans);

	}

}
