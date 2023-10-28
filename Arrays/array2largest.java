public class array2largest {
public static void main(String[] args) {
    int arr[] = { 1,23,3,4,5,5,5};
    int large = largest( arr );
    System.out.println(large);
}
 static int largest ( int arr[] ){
    int ret = 0;
    for ( int i = 0 ; i < arr.length ; i++ ){
        if ( arr[i]> ret ){
            ret = arr[i];
        }
    }
     return ret;
 }
}
    

