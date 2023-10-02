/**
 * 
 */
package sorting;

/**
 * @author Rupayan Dirghangi
 *
 */
public class LexicographicalSortedArray {
	public static void printArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sortFruits(String fruits[]) {
		int n=fruits.length;
		for(int i=0;i<n-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<n;j++) {
				if(fruits[j].compareTo(fruits[minIndex])<0) {
					minIndex=j;
				}
			}
			String temp=fruits[i];
			fruits[i]=fruits[minIndex];
			fruits[minIndex]=temp;
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fruits = { "papaya", "lime", "watermelon", "apple", "kiwi" };
		printArray(fruits);
		sortFruits(fruits);
		System.out.println();
		printArray(fruits);

	}

}
