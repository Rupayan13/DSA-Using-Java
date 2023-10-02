/**
 * 
 */
package hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rupayan Dirghangi
 *
 */
public class CheckingAnagrams {
	public static Map<Character, Integer> makeFreqMap(String str) {
		Map<Character, Integer> anagram = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (!anagram.containsKey(str.charAt(i))) {
				anagram.put(str.charAt(i), 1);
			} else {
				anagram.put(str.charAt(i), anagram.get(str.charAt(i)) + 1);
			}
		}
		return anagram;
	}

	public static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		Map<Character, Integer> anagram = makeFreqMap(str1);
		for (int i = 0; i < str2.length(); i++) {
			if (!anagram.containsKey(str1.charAt(i))) {
				return false;
			} else {
				anagram.put(str1.charAt(i), anagram.get(str1.charAt(i)) - 1);
			}
		}
		for (var e : anagram.entrySet()) {
			if (e.getValue() != 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isAnagram2(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		Map<Character, Integer> anagram1 = makeFreqMap(str1);
		Map<Character, Integer> anagram2 = makeFreqMap(str2);

		return anagram1.equals(anagram2);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("silent", "listen"));
		System.out.println(isAnagram2("silent", "listen"));

	}

}
