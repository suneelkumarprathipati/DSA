import java.util.*;
public class array9leftshiftbyb {
    public static void main(String[] args) {
        int arr[] = {1,2,34,4,5,6};
        int d = 3;
        int n = arr.length;
        leftrotatebyd ( arr,d,n);
        System.out.println(Arrays.toString(arr));
    }
    static void leftrotatebyd(int[] arr , int d,int n){
        reverse (arr,0,d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1 );
    }
    static void reverse ( int[] arr,int low , int high){
        while ( low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
