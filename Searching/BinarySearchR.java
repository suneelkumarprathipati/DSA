//Recursive Approch
public class BinarySearchR {
    public static void main(String[] args) {
     int[] arr = {1,2,3,4,5};
        int target = 9;
    int left = 0 , right = arr.length-1;
       int index = binarysearch(arr,target,left,right); 
       System.out.println(index);
    }
    static int  binarysearch( int[] arr , int target ,int left , int right){
        if (left > right) return -1;
            int mid = (left+right)/2;
            if ( arr[mid] == target )
                return mid;
            else if ( arr[mid] > target )
            return binarysearch(arr, target, left, mid-1);
            else if ( arr[mid] < target )
               return binarysearch(arr, target, mid+1, right);
               return mid;
}
}
// Recursive solution have O(log(n)) space complexity compared to 
//iterative solution takes O(1) space complexity