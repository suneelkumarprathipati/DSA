public class Triplets {
    public static void main(String[] args) {
        int[] arr = { 1,2,4,5,6,7,54,346,675,98787,896877};
        int target = 352;
        System.out.println(isTriplets( arr , target ));
    }
    static boolean isTriplets(int[] arr , int target ){
        for ( int i = 0 ; i < arr.length-1 ; i++ ){
            if ( twoPoint(arr, target-arr[i], i+1, arr.length-1) )
            return true;
        }
        return false;
    }
    static boolean twoPoint( int[] arr , int target , int left , int right ){
        while ( left < right ){
            if ( arr[left] + arr[right] == target )
            return true;
            else if (arr[left]+arr[right] > target)
            right--;
            else if (arr[left]+arr[right]< target)
            left++;
        }
        return false;
    }
}
// this approch is suitable for sorted array 
//sorting needs big O(nlogn) and this approch needs big O(n^2)