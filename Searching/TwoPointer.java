public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = { 2,5,8,12,30};
        int target = 30;
        System.out.println(twoPoint(arr,target));
    }
    static boolean twoPoint( int[] arr , int target ){
        int left = 0 , right = arr.length-1;
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
//sorting needs big O(nlogn) and this approch needs big O(n)
//Problems on Two Pointer 
//1.Count Pairs with given Sum
//2.Count Triplets with given Sum
//3.Find if there is a Triplet a,b,c such that a^2+b^2 = c^2  AMAZON Interview