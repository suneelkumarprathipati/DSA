
public class LastIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,3,4,4,4,5,6,7,7,7,};
        int target = 3;
        int left = 0 ,right = arr.length-1;
        int last = lastOccurence(arr, target , left , right );
        System.out.println(last);
    }
    static int lastOccurence(int arr[] , int target , int left , int right){
        while ( left <= right ){
            int mid = (left+right)/2;
            if ( target > arr[mid])
                left = mid+1;
            else if ( target < arr[mid] )
                right = mid-1;
            else {
                if (mid == arr.length-1 || arr[mid+1]!=arr[mid]){
                    return mid;
                }
                else
                left= mid+1;
            }
        }
        return -1;
    }
}
