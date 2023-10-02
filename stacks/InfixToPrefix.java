/**
 * 
 */
package stacks;

import java.util.Stack;

/**
 * @author Rupayan Dirghangi
 *
 */
public class InfixToPrefix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String infix = "9-(5+3)*4/6";
		System.out.println(infix);
		Stack<String> val = new Stack<>();
		Stack<Character> op = new Stack<>();
		for (int i = 0; i < infix.length(); i++) {
			char ch = infix.charAt(i);
			int ascii = (int) ch;
			// '0'->48 && '9'->57
			if (ascii >= 48 && ascii <= 57) {
				val.push(String.valueOf(ascii - 48));
			} else if (op.size() == 0 || ch == '(' || op.peek() == '(') {
				op.push(ch);
			} else if (ch == ')') {
				while (op.peek() != '(') {
					//work
					String v2 = val.pop();
					String v1 = val.pop();
					char o=op.pop();
					String t=o+v1+v2;
					val.push(t);
				}
				op.pop();// opening bracket removed
			} else {
				if (ch == '+' || ch == '-') {
					// work
					String v2 = val.pop();
					String v1 = val.pop();
					char o=op.pop();
					String t=o+v1+v2;
					val.push(t);
					// push
					op.push(ch);
				}
				if (ch == '*' || ch == '/') {
					if (op.peek() == '*' || op.peek() == '/') {
						// work
						String v2 = val.pop();
						String v1 = val.pop();
						char o=op.pop();
						String t=o+v1+v2;
						val.push(t);
						// push
						op.push(ch);
					} else {
						op.push(ch);
					}
				}
			}
		}
		// val stack size -> 1
		while (val.size() > 1) {
			String v2 = val.pop();
			String v1 = val.pop();
			char o=op.pop();
			String t=o+v1+v2;
			val.push(t);
		}
		System.out.println(val.peek());


	}

}
