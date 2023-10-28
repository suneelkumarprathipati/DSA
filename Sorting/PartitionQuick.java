// To partition the array based on the given pivot index
// The left and right need not be sorted but they should be positioned in the way where smaller are left side and greater are 
// right side of the pivot
// index of pivot will be given
// if there are equal to pivot they must be left of the element

//import java.util.Arrays;

import java.util.Arrays;

public class PartitionQuick {
    public static void main(String[] args) {
        int[] arr = {1,4,5,63,2,6,321,14,5,3211,328};
        int p = 7;
        naive( arr, p , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void naive( int[] arr , int p , int l , int h ){
        int[]  temp = new int[h-l+1] ;
        int  index = 0;
        for ( int i = l ; i <= h ; i++ ){
            if ( arr[i] <= arr[p]){
                temp[index] = arr[i];
                index++;
            }
        }
        for ( int i = l ; i <= h ; i++ ){
            if ( arr[i] > arr[p] ){
                temp[index] = arr[i];
                index++;
            }
        }
        for ( int i = l ; i <= h ; i++ ){
            arr[i] = temp[i-l];
        }
        
    }
}
// This solution takes TC-O(n) and Aux Space - O(n) and tekes three traversals
// TO reduce the space we use Lomuto partition
// It is stable 