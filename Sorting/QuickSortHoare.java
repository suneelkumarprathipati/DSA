import java.util.Arrays;

public class QuickSortHoare {
    public static void main(String[] args) {
      int[] arr = {1,4,5,63,2,6,321,14,5,3211,20};
        Quick( arr ,  0 , arr.length-1);
        System.out.println(Arrays.toString(arr));   
    }
    static void Quick( int[] arr , int l , int r ){
        if (l < r ){
            int p = hoares( arr, l , r );
            Quick(arr, l, p);   // In lomuto partition p as p-1 
            Quick(arr, p+1, r);
        }
    }
    public static int hoares(int[] arr, int low, int high) {
        int pivot = arr[low];
        int left = low - 1;
        int right = high + 1;

        while (true) {
            do {
                left++;
            } while (arr[left] < pivot);

            do {
                right--;
            } while (arr[right] > pivot);

            if (left >= right) {
                return right;
            }

            // Swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }
}
//Hoare's partition is 3 times faster then lomuto partition and unstable
