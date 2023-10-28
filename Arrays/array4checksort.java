public class array4checksort {
    public static void main(String[] args) {
        int arr[] = { 5,20,20,20,30};
        boolean n = checksort( arr );
        System.out.println(n);
    }
    static boolean checksort ( int arr[]){
        for ( int i = 1 ; i < arr.length ; i++ ){
            if ( arr[i] < arr[i-1])
            return false;
        }
        return true;
    }
}
