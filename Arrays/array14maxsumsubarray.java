public class array14maxsumsubarray {
    public static void main(String[] args) {
        int arr[] = {1,-2,3,4,5,-1,-5};
        int n  = maxsum( arr );
        System.out.println(n);
    }
    static int maxsum( int arr[]){
        int res = arr[0],maxending = arr[0];
        for ( int i = 1; i < arr.length; i++ ){
            maxending = Math.max(maxending+arr[i],arr[i]);
            res = Math.max( res, maxending);
        }
        return res;
    }
}
