//Iterative approch
class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 6;
       int index = binarysearch(arr,target); 
       System.out.println(index);
    }
    static int  binarysearch( int[] arr , int target ){
        int left = 0 , right = arr.length-1;
        while ( left <= right ){
            int mid = (left+right)/2;
            if ( arr[mid] == target ){
                return mid;
            }
            else if ( arr[mid] > target ){
                right = mid-1;
            }
            else if ( arr[mid] < target ){
                left = mid+1;
            }
        }
        return -1;
    }
}
//Iterative solution is better than a recursive solution due to space of iterative is O(1) ,
// where as recursive takes space O(log(n))