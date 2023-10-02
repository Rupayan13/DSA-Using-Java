/**
 * 
 */
package recursion;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PrintSSQ {
	public static void printSSQ(String s, String currAns) {
		//base case
		if(s.length()==0) {
			System.out.println(currAns);
			return;
		}
		
		char curr=s.charAt(0);
        String remString = s.substring(1);
        
        //curr char-> chooses to be a part of currAns
        printSSQ(remString, currAns+curr);
        
        //curr char-> does not choose to be a part of currAns
        printSSQ(remString, currAns);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSSQ("abc", "");

	}

}
