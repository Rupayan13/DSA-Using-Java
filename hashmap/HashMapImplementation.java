/**
 * 
 */
package hashmap;

import java.util.LinkedList;

/**
 * @author Rupayan Dirghangi
 *
 */
public class HashMapImplementation {
	public static class MyHashMap<K, V> {
		public static final int DEFAULT_CAPACITY = 4;
		public static final float DEFAULT_LOAD_FACTOR = 0.75f;

		private class Node {
			K key;
			V value;

			Node(K key, V value) {
				this.key = key;
				this.value = value;
			}
		}

		private int n;// the number of entries in map

		private LinkedList<Node>[] buckets;

		private void initBuckets(int N) {// n- capacity/size of buckets array
			buckets = new LinkedList[N];
			for (int i = 0; i < buckets.length; i++) {
				buckets[i] = new LinkedList<>();
			}
		}

		private int hashFunction(K key) {
			int hc = key.hashCode();
			return Math.abs(hc) % buckets.length;
		}

		// Traverses the ll and looks for a node with key, if found it returns ints
		// index otherwise it returns null
		private int searchInBucket(LinkedList<Node> ll, K key) {
			for (int i = 0; i < ll.size(); i++) {
				if (ll.get(i).key == key) {
					return i;
				}
			}
			return -1;
		}

		private void rehash() {
			LinkedList<Node>[] oldBuckets = buckets;
			initBuckets(oldBuckets.length * 2);
			n=0;
			for (var bucket : oldBuckets) {
				for (var node : bucket) {
					put(node.key, node.value);
				}
			}
		}
		
		public int capacity() {
			return buckets.length;
		}
		public float load() {
			return (n*1.0f)/buckets.length;
		}

		public MyHashMap() {
			initBuckets(DEFAULT_CAPACITY);
		}

		public int size() {// return the nuumber of entries in the map
			return n;
		}

		public void put(K key, V value) {// insert and update
			int bi = hashFunction(key);
			LinkedList<Node> currentBucket = buckets[bi];
			int ei = searchInBucket(currentBucket, key);
			if (ei == -1) {// key doesn't exist, we have to insert a new node
				Node node = new Node(key, value);
				currentBucket.add(node);
				n++;
			} else {// update case
				Node currNode = currentBucket.get(ei);
				currNode.value = value;
			}

			if (n >= buckets.length * DEFAULT_LOAD_FACTOR) {
				rehash();
			}
		}

		public V get(K key) {
			int bi = hashFunction(key);
			LinkedList<Node> currentBucket = buckets[bi];
			int ei = searchInBucket(currentBucket, key);
			if (ei != -1) {// key exists
				Node currNode = currentBucket.get(ei);
				return currNode.value;
			} else {// key doesn't exist
				return null;
			}
		}

		public V remove(K key) {
			int bi = hashFunction(key);
			LinkedList<Node> currentBucket = buckets[bi];
			int ei = searchInBucket(currentBucket, key);
			if (ei != -1) {// key exists
				Node currNode = currentBucket.get(ei);
				currentBucket.remove(ei);
				n--;
				return currNode.value;
			} else {// key doesn't exist
				return null;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashMap<String, Integer> mp = new MyHashMap<>();
		System.out.println("Testing put");
		System.out.println("Current capacity:-"+mp.capacity());
		mp.put("A", 1);
		mp.put("B", 2);
		mp.put("C", 3);
		mp.put("X", 61);
		mp.put("Y", 71);
		System.out.println(mp.size());
		mp.put("C", 30);// update the value of key C
		System.out.println(mp.size());
		System.out.println(mp.get("A"));// 1
		System.out.println(mp.get("B"));// 2
		System.out.println(mp.get("C"));// 30
		System.out.println(mp.get("D"));// null
		System.out.println(mp.get("X"));
		System.out.println(mp.get("Y"));

		System.out.println(mp.remove("C"));
		System.out.println(mp.remove("C"));
		System.out.println(mp.size());
		System.out.println("Current capacity:-"+mp.capacity());
		System.out.println("Load factor:-"+mp.load());

	}

}
