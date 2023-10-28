import java.util.*;
public class array5reverse {
    public static void main(String[] args) {
        int arr[] = { 5,20,12,20,10};
        reverse ( arr );
        System.out.println(Arrays.toString(arr));
    }
    static void reverse ( int arr[] ){
        int low = 0,high = arr.length-1;
        while ( low < high){
            int temp = arr[low];
            arr[low]  = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
      //  System.out.println(arr.toString());
    }
}
