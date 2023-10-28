// In Naive solution of PartitionQuick we use pivot as different element
// In this partition we take last element as a pivot element always
//It is unstable
import java.util.Arrays;

public class LomutoPartition {
    public static void main(String[] args) {
         int[] arr = {1,4,5,63,2,6,321,14,5,3211,20};
        lomuto( arr ,  0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void lomuto( int arr[] , int l , int h ){
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

      //  return i; // Return the index of the pivot
    }
}
// this solution takes one traversal and TC -O(n) and Aux space - O(1) better than navie solution 
//Hoare's partition is much much better than this method
