public class countOccurences {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,4,5,5,5,5,5,7,7,7};
        int target = 5;
        int left = 0 ;
        int  right = arr.length-1;
      System.out.println( lastOccurence(arr, target, left, right)-firstoccurence(arr, target, left, right)+1);
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
