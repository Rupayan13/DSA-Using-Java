/**
 * 
 */
package recursion;

/**
 * @author Rupayan Dirghangi
 *
 */
public class KeypadCombinations {
	public static void combination(String dig, String[] kp, String res) {
		if(dig.length()==0) {
			System.out.print(res+" ");
			return;
		}
		
		int currNum=dig.charAt(0)-'0';//2
		String currChoices=kp[currNum];//abc
		
		for(int i=0;i<currChoices.length();i++) {
			combination(dig.substring(1), kp, res+currChoices.charAt(i));
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="253";
		
		String kp[]= {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		//             0   1    2      3      4      5      6       7      8       9
		
		combination(s, kp, "");

	}

}
