/**
 * 
 */
package recursion;

/**
 * @author Rupayan Dirghangi
 *
 */
public class LinearSearch {
	public static int search(int[] arr, int idx, int x) {
		// base case
		if (idx == arr.length - 1) {
			if (arr[idx] == x) {
				return idx;
			}
			return -1;
		}
		// sub problems
		int search = search(arr, idx + 1, x);
		// self work
		if (arr[idx] != x) {
			return search;
		}
		return idx;
	}

	public static boolean searchBool(int[] arr, int idx, int x) {
		// base case
		if (idx == arr.length - 1) {
			if (arr[idx] == x) {
				return true;
			}
			return false;
		}
		// sub problems
		boolean search = searchBool(arr, idx + 1, x);
		// self work
		if (arr[idx] != x) {
			return search;
		}
		return true;
	}

	public static boolean cwBoolSearch(int[] arr, int idx, int x) {
		// base case
		if (idx >= arr.length) {
			return false;
		}
		// self work
		if (arr[idx] == x) {
			return true;
		}
		// sub problems
		return cwBoolSearch(arr, idx + 1, x);
//		if(cwBoolSearch(arr, idx+1, x)) {
//			return true;
//		}
//		else {
//			return false;
//		}
	}

//	Find First Index ->return index of target if target present in array, otherwise return -1
	public static int cwFindIndex(int[] arr, int idx, int x) {
		// base case
		if (idx >= arr.length) {
			return -1;
		}
		// self work
		if (arr[idx] == x) {
			return idx;
		}
		// sub problems
		return cwFindIndex(arr, idx + 1, x);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4, 12, 54, 14, 3, 8, 6, 1 };
		System.out.println(search(arr, 0, 11));
		System.out.println(searchBool(arr, 0, 14));
		System.out.println(cwBoolSearch(arr, 0, 11));
		System.out.println(cwFindIndex(arr, 0, 6));

	}

}
