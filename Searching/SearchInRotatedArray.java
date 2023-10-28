public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = { 10,20,40,60,5,8};
        int target = 8;
        int ret = rotatedsearch(arr, target);
        System.out.println(ret);
    }
    static int rotatedsearch(int[] arr , int target){
       int low = 0 , high = arr.length-1;
       while ( low <= high){
        int mid = (low+high)/2;
        if ( arr[mid] == target) return mid;
        if (arr[low] <arr[mid]){
            if (target >=arr[low] && target <arr[mid])
            high = mid-1;
            else 
            low = mid+1;
        }
        else{
            if ( target > arr[mid] && target <= arr[high])
            low = mid+1;
            else 
            high = mid-1;
        }
       }
       return -1;
    }
}
