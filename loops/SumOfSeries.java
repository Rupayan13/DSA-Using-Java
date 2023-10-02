/**
 * 
 */
package loops;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SumOfSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int n=sc.nextInt();
		int ans=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				ans-=i;
			}
			else {
				ans+=i;
			}
		}
		System.out.println("The sum of the series is "+ans);

	}

}
