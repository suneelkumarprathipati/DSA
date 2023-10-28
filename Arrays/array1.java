import java.util.Arrays;

public class array1 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        delete(myArray, myArray.length ,3 );
        System.out.println("Array Contents: " + Arrays.toString(myArray));
    }
    static int delete( int arr[] , int n , int x){
        int i ;
        for (  i = 0 ; i < n ; i++ ){
            if ( arr[i] == x){
                break;
        }
       
        }
         if (i==n){
            return n;
        }
        for ( int j = i ; j < n-1 ; j++ ){
            arr[j] = arr[j+1];
        }
        return n-1;
        
    }
}