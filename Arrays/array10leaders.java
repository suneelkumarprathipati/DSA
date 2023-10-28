public class array10leaders {
    public static void main(String[] args) {
        int arr[] = { 3,5,7,2,6,1 };
         leaders(arr);
    }
    static void leaders( int arr[] ){
        int ldr = arr[arr.length-1];
        System.out.println(ldr);
        for ( int i = arr.length-2; i > 0 ; i-- ){
            if ( ldr < arr[i] ){
                System.out.println(arr[i]);
                ldr = arr[i];
            }
        }
    }
}
