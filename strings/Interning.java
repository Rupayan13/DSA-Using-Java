/**
 * 
 */
package strings;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Interning {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";// -> Heylo
		String x="Hello";
		x="Mello";
		System.out.println(s);
		s=s.substring(0, 2)+ 'y'+s.substring(3);
		System.out.println(s);
		

	}

}
