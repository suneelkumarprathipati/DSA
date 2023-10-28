//in worst case scenario it will take O(n^2) TC
//it is In-place and stable (no extra space is required and position will be same as in the array)
// Used in practice for small arrays (Timsort and Intro sort)
// O(n) in best case scenario
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5,3,45,6,7,8,4,3,3,3,2,1 };
        insertion( arr );
        for ( int i = 0 ; i < arr.length ; i++ )
        System.out.print(arr[i]+" ");
    }
    static void insertion( int[] arr ){
        for ( int i = 1 ; i < arr.length ; i++ ){
            int key = arr[i];
            int j = i-1;
            while ( j >= 0 && arr[j] > key ){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key ;
        }
    }
}
