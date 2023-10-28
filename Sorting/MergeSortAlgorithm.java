public class MergeSortAlgorithm {
    public static void main(String[] args) {
        int[] nums = { 10 , 5 , 51 , 20 , 30 ,344,642,2,1,456};
            mergesort( nums, 0 , nums.length-1 );
       printarray( nums);
    }
   public static void mergesort( int[] arr , int l , int r){
        if ( r > l ){
            int mid = l + (r-l)/2;
            mergesort(arr, l, mid);
            mergesort(arr, mid+1, r);
            mergefunction(arr, l, mid, r);
        }
    }
   public static void mergefunction( int[] arr , int low , int mid , int high ){
        int[] left = new int[mid-low+1];
        int[] right = new int[high- mid];
        for ( int i = 0 ; i < left.length ; i++ ) left[i] = arr[low+i];
        for ( int i = 0 ; i < right.length ; i++ ) right[i] = arr[mid+1+i];
        int i = 0,j = 0,k = low;
        while (i < left.length && j < right.length){
             if ( left[i] <= right[j]){
                arr[k] = left[i];
                k++;
                i++;
             }
             else{
                arr[k] = right[j];
                j++;
                k++;
             }
        }
        while ( i < left.length){
           arr[k] = left[i];
                k++;
                i++;
        }
        while ( j < right.length){
           arr[k] = right[j];
                k++;
                j++;
        }
    }
    public static void printarray( int[] arr){
        for ( int i = 0 ; i < arr.length ; i++ ){
            System.out.print(arr[i]+" ");
        }
    }
}
