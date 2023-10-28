// Selection sort is the unStable sorting algorithm.
// It takes O(n^2) time complexity .
//Does Less memory Writes compared to Quick Sort , merge Sort ,Insertion Sort etc...,
// But cycle Sort is the Optimal in terms of memory writes.
// Basic Idea for Heapsort .
// not Stable.
// In-place - does not require any extra space 
// Idea- is to put smaller elements in first position iteration by iteration until sorted.
//Naive solution takes an extra arry temp to complete the sorting.
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {49,322,4,57,4,3,6,0};
        selectionsort ( arr );
        for ( int i : arr )
        System.out.print(i+" ");
    }
    static void selectionsort( int[] arr ){
        for ( int i = 0 ; i < arr.length-1 ; i++ ){
            int minInd = i ;
            for ( int j = i+1 ; j < arr.length ; j++){
                if ( arr[minInd] > arr[j])
                minInd = j;
            }
            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }
         return;
    }
}
//It always takes O(n^2) what ever the array should be sorted, unsorted,reversed,etc...
// number of iterations are (n-1)+(n-2)+.....2+1
//n*(n-1)/2 iterations
