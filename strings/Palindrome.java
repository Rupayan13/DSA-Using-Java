/**
 * 
 */
package strings;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdcba";
//		StringBuilder gtr=new StringBuilder(str);
//		gtr.reverse();
//		String s=gtr+"";
//		if(str.equals(s)) {
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("Not Plaindrome");
//		}
		int i=0;
		int j=str.length()-1;
		boolean flag=true;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				System.out.println("Not Plaindrome");
				flag=false;
				break;
			}
			i++;
			j--;
		}
		if(flag==true) {
			System.out.println("Palindrome");
		}
		

	}

}
