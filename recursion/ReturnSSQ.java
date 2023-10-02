/**
 * 
 */
package recursion;

import java.util.ArrayList;

/**
 * @author Rupayan Dirghangi
 *
 *s="abc"
 */
public class ReturnSSQ {
	public static ArrayList<String> getSSQ(String s){
		ArrayList<String> ans=new ArrayList<String>();
		
		//base case
		if(s.length()==0) {
			ans.add("");
			return ans;
		}
		char curr=s.charAt(0);//a
		//sub problem
		ArrayList<String> smallAns=getSSQ(s.substring(1));// "bc" "b" "c" ""
		
		//smallAns=["bc", "b", "c", ""]
		//ans=["bc", "b", "c", "", "abc", "ab", "ac", "a"]
		for(String ss: smallAns) {
			ans.add(ss); //bc
			ans.add(curr+ss); //abc
		}
		return ans;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ans=getSSQ("abc");
		for(String ss: ans) {
			System.out.println(ss);
		}

	}

}
