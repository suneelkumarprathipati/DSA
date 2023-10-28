public class PeakElement {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,2,4,4,5,43,2,5,3,224,4};
        peakelements(arr, arr.length);
    }
    static void peakelements( int arr[] , int n ){
        int low = 0 , high = n-1;
        while ( low <= high ){
            int mid = (low+high)/2;
            if (mid == 0 || arr[mid-1]<= arr[mid] && mid == n-1 || arr[mid+1] <= arr[mid]) // checking starting and element and left and right of the mid element
            {
                System.out.println(arr[mid]);
                return ;
            }
            else {
                if ( mid>0 && arr[mid-1] >= arr[mid]) // if left of mid is greater than mid then ignores right sub array
                high = mid-1;
                else                                  // else right of mid is greater than mid then ignores left sub array 
                low = mid+1;
        }
}
  System.out.println(-1); // if not present in the array return -1
        return;
}
}
