/*
 * Divide and Conquer Algorithm
 * worst case time - O(n^2)
 * Despite  O(n^2)  worst case , it is considered faster,because of following reasons
 * 1 , In-place
 * 2 , Cache Friendly 
 * 3 , Average case is O(nlogn) 
 * 4 , Tail Recursive
 * partition is key ( Naive , Lomuto , Hoare)
 * for efficient we use lomuto and hoare 
 * for fast we use hoare
 * and for stable case we use Naive
 * Mostly we use lomuto and hoare
 */

import java.util.Arrays;

public class QuickSortLomuto {
    public static void main(String[] args) {
      int[] arr = {1,4,5,63,2,6,321,14,5,3211,20};
        Quick( arr ,  0 , arr.length-1);
        System.out.println(Arrays.toString(arr));   
    }
    static void Quick( int[] arr , int l , int r ){
        if (l < r ){
            int p = lomuto( arr, l , r );
            Quick(arr, l, p-1);
            Quick(arr, p+1, r);
        }
    }
    static int lomuto( int arr[] , int l , int h ){
        int pivot = arr[h]; // Choose the pivot as the last element
        int i = l; // Initialize the partition point

        for (int j = l; j < h; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        int temp = arr[i];
        arr[i] = arr[h];
        arr[h] = temp;

      return i; // Return the index of the pivot
    }
}
