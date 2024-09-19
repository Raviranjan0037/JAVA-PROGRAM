package sep12.Threads;

import java.util.Arrays;

	public class MergedArray {
	    public static void main(String[] args) {
	        int[] arr1 = {2, 4, 16, 88, 98};
	        int[] arr2 = {3, 7, 78, 80, 100};

	        int[] combinedArray = new int[arr1.length + arr2.length];
	        System.arraycopy(arr1, 0, combinedArray, 0, arr1.length);
	        System.arraycopy(arr2, 0, combinedArray, arr1.length, arr2.length);

	        Arrays.sort(combinedArray);

	        for (int num : combinedArray) {
	            System.out.print(num + " ");
	        }
	    }
	}
	