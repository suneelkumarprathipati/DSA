// Naive solution 
public class LargeRectangularAreaNaive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3};
        int ret = area(arr,arr.length );
        System.out.println(ret);
    }
    static int area( int[] arr , int n ){
        int ret = 0;
        for ( int i = 0 ; i < n ; i++ ){
            int curr = arr[i];
            for ( int j = i-1 ; j >= 0 ; j-- ){
                if ( arr[j] >= arr[i] ) curr+=arr[i];
                else break;
            }
            for ( int j = i+1 ; j < n ; j++ ){
                if ( arr[j] >= arr[i] ) curr+=arr[i];
                else break;
            }
            ret = Math.max(ret,curr);
        }
        return ret;
    }
}
