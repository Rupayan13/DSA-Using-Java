/**
 * 
 */
package strings;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Builder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str=new StringBuilder("hello");
		str.append(" world");
		System.out.println(str);
		//hello world-> mello world
		str.setCharAt(0, 'm');
		System.out.println(str);
		//mello world-> meyllo world
		str.insert(2, 'y');
		System.out.println(str);
		//mello world <- meyllo world
		str.deleteCharAt(2);
		System.out.println(str);
		StringBuilder sb=new StringBuilder("physics");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(2, 4);// 2 to 3 delete
		System.out.println(sb);

	}

}
