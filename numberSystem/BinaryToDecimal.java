/**
 * 
 */
package numberSystem;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class BinaryToDecimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary number :");
		int binary_num=sc.nextInt();
		
		int ans=0; //Converted decimal number
		int pw=1;//Power of 2(2^0=1)
		
		while(binary_num>0)
		{
			int unit_digit=binary_num%10;
			ans+=(unit_digit * pw);
			binary_num/=10;
			pw*=2;
		}
		System.out.println("The decimal number is: "+ans);

	}

}
