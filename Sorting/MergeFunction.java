public class MergeFunction {
    public static void main(String[] args) {
    int[] arr = { 10,15,20,40,8,11,55};
        int low = 0; 
        int mid = 3;
        int high= 6;
        int[] arr1 = new int[arr.length];
    arr1 = mergefunction( arr, low , mid , high );
    for ( int i = 0 ; i < arr.length ; i++ )
      System.out.print(arr1[i]+" ");
    }
    static int[] mergefunction( int[] arr , int low , int mid , int high ){
        int[] left = new int[mid-low+1];
        int[] right = new int[high- mid];
        for ( int i = 0 ; i < left.length ; i++ ) left[i] = arr[i];
        for ( int i = 0 ; i < right.length ; i++ ) right[i] = arr[left.length+i];
        int i = 0,j = 0,k = 0;
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
           return arr;
    }
    
}
//TC - O(n)
//SC - O(n)
