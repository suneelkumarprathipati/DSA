// Count of inversions means the elements which are greater than the right beside of them 
// arr[i] > arr[j] 
//import java.util.*;
public class CountInversions {
    public static void main(String[] args) {
       int[] arr = { 1,2,0,24,6,67,43,2,6,76,44,322,46};
       int count = countinv( arr, 0 , arr.length-1 );
        System.out.println(count);
    }
    public static int countinv( int[] arr , int l , int r ){
        int res = 0;
        if ( r > l ){
            int mid = l + (r-l)/2;
           res+= countinv( arr, l , mid );
           res+= countinv( arr, mid+1 , r);
           res+= countmerge(arr,l , mid ,r );
        }
        return res;
    }
    public static int countmerge( int[] arr , int low , int mid , int high ){
        int s1 = mid-low+1 , s2 = high-mid;
        int[] left = new int[s1];
        int[] right = new int[s2];
        for ( int i = 0 ; i < s1 ; i++ ) left[i] = arr[low+i];
        for ( int i = 0 ; i < s2 ; i++ ) right[i] = arr[mid+1+i];
        int i = 0, j = 0 ,k = low , res  = 0;
        while ( i < s1 && j < s2 ){
            if ( left[i] <= right[j] ) arr[k++] = left[i++];
           else  {
            j++;
            res += (s1-i);
            k++;
           }
        }
        while ( i < s1 ) arr[k++] = left[i++];
        while ( j < s2 ) arr[k++] = right[j++];
        return res;
    }

}