public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,4,5,5,5,7,7,7};
        int target = 7;
        int left = 0 ;
        int  right = arr.length-1;
       int first = firstoccurence(arr, target, left, right);
       System.out.println(first);
        }
        static int firstoccurence(int arr[] , int target , int left , int right ){
             while (left <= right ) {
            int mid = (left+right)/2;
            if ( target > arr[mid])
            left = mid+1;
            else if ( target < arr[mid])
            right = mid-1;
            else {
                if ( mid == 0 || arr[mid-1] != arr[mid]){
                    return mid;
                }
                else {
                    right = mid-1;
                }
            }
        }
        return -1;
    }
}
