public class count1sInSorted {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,1,1,1};
        int left = 0 ;
        int  right = arr.length-1;
       int ones = firstoccurence(arr, left, right);
       System.out.println(ones);
    }
    static int firstoccurence(int arr[] , int left , int right ){
        while (left <= right ) {
       int mid = (left+right)/2;
       if (  arr[mid]==0 )
       left = mid+1;
       else {
           if ( mid == 0 || arr[mid-1] != arr[mid]){
               return arr.length-mid;
           }
           else {
               right = mid-1;
           }
       }
   }
   return -1;
}
    
}
