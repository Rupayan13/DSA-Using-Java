/**
 * 
 */
package recursion;

/**
 * @author Rupayan Dirghangi
 *
 */
public class RemoveOccurances {
	public static String removeOccurances(String s, int idx, char ch) {
		//base case
		if(idx==s.length()) {
			return "";
		}
		//recursive work
		String ans=removeOccurances(s,idx+1,ch);
		//self work
		if(s.charAt(idx)==ch) {
			return ans;
		}
		else {
			return s.charAt(idx)+ans;
		}
		
	}
	public static String removeOccurances2(String s, char ch) {
		//base case
		if(s.length()==0) {
			return "";
		}
		//recursive work
		String smallAns=removeOccurances2(s.substring(1), ch);
		//self work
		if(s.charAt(0)==ch) {
			return smallAns;
		}
		else {
			return s.charAt(0)+smallAns;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaaaa";
		System.out.println(removeOccurances2(s, 'a'));

	}

}
