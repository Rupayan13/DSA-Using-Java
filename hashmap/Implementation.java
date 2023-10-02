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
public class Implementation {
	public static void hashMapMethods() {
		Map<String, Integer> mp = new HashMap<>();
		// Insert elements
		mp.put("Akash", 21);
		mp.put("Yash", 16);
		mp.put("Lav", 17);
		mp.put("Rishika", 19);
		mp.put("Harry", 18);
		// Getting value of a key from the map
		System.out.println(mp.get("Yash")); // 16
		System.out.println(mp.get("Rahul")); // null
		// Changing or updating value of a key in the hashmap
		mp.put("Akash", 25); // Akash->25
		System.out.println(mp.get("Akash"));
		// Removing a pair from the hashmap
		System.out.println(mp.remove("Akash"));
		System.out.println(mp.remove("riya"));
		// Checking if a key is in the hashmap
		System.out.println(mp.containsKey("Akash"));
		System.out.println(mp.containsKey("Yash"));
		// Adding a new entry only if the new key doesn't exist already
		if (!mp.containsKey("Yash")) {
			mp.put("Yash", 30);
		}
		mp.putIfAbsent("Yashika", 30); // will enter
		mp.putIfAbsent("Yash", 30); // will not enter
		// Get all the keys in hashmap
		System.out.println(mp.keySet());
		// Get all the values in hashmap
		System.out.println(mp.values());
		// Get all the entries of the hashmap
		System.out.println(mp.entrySet());
		
		//Traversing all entries of hashmap
		for(String key: mp.keySet()) {
			System.out.printf("Age of %s is %d\n", key, mp.get(key));
		}
		System.out.println();
		for(Map.Entry<String, Integer> e: mp.entrySet()) {
			System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
		}
		System.out.println();
		for(var e:mp.entrySet()) {
			System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashMapMethods();

	}

}
