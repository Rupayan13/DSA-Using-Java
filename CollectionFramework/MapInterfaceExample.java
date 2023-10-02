/**
 * 
 */
package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Rupayan Dirghangi
 *
 */
public class MapInterfaceExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> mp = new HashMap<>();
		mp.put(3, "Aman");
		mp.put(1, "Rohan");
		mp.put(2, "Riya");
		mp.putIfAbsent(1, "Priya");
		System.out.println(mp);
		System.out.println(mp.get(2));
		System.out.println(mp.containsKey(4));
		System.out.println(mp.containsValue("Riya"));
		System.out.println(mp.entrySet());
		System.out.println(mp.keySet());
		System.out.println(mp.values());
		// Iterating over keys in a map
		for (Integer i : mp.keySet()) {
			System.out.println(i);
		}
		// Iterating over values in a map
		for (var i : mp.values()) {
			System.out.println(i);
		}
		//Iterate over key-value mapping
		for(var e:mp.entrySet()) {
			System.out.println(e);
			System.out.println(e.getValue());
			System.out.println(e.getKey());
		}

	}

}
