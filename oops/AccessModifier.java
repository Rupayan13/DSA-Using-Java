/**
 * 
 */
package oops;

/**
 * @author Rupayan Dirghangi
 *
 */
public class AccessModifier {
	public String str_1="I am a public member";
	
	void printFromClass() {
		System.out.println("Within the class: "+str_1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier am=new AccessModifier();
		am.printFromClass();
		System.out.println("Within the class: "+am.str_1);
		
		AccessModifier2 am2=new AccessModifier2();
		am2.printFromOutsideClass();

	}

}
class AccessModifier2{
	void printFromOutsideClass() {
		AccessModifier am=new AccessModifier();
		System.out.println("Within package, outside the class: "+am.str_1);
	}
}
