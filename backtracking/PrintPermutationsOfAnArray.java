/**
 * 
 */
package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PrintPermutationsOfAnArray {
	public static void printPermutationsOfAnArray(int arr[], List<List<Integer>> ans, List<Integer> ds,
			boolean isValid[]) {
		if (ds.size() == arr.length) {
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < ds.size(); i++) {
				list.add(ds.get(i));
			}
			ans.add(list);
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (isValid[i] == false) {
				ds.add(arr[i]);
				isValid[i] = true;
				printPermutationsOfAnArray(arr, ans, ds, isValid);
				isValid[i] = false;
				ds.remove(ds.size() - 1);
			}
		}
	}
	public static void swap(int i, int j, int arr[]) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void printPermutationsOfAnArrayM2(int arr[], int idx, List<List<Integer>> ans) {
		if (idx == arr.length-1) {
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < arr.length; i++) {
				list.add(arr[i]);
			}
			ans.add(list);
			return;
		}
		for (int i = idx; i < arr.length; i++) {
			swap(i, idx, arr);
			printPermutationsOfAnArrayM2(arr, idx+1, ans);
			swap(i, idx, arr);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3 };
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> ds = new ArrayList<>();
		boolean isValid[] = new boolean[arr.length];// by default-> false
//		printPermutationsOfAnArray(arr, ans, ds, isValid);
		printPermutationsOfAnArrayM2(arr, 0, ans);
		System.out.println(ans);
	}

}
