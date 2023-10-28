//Bubble sort is a Stable algorithm which is sort the elements by the position of the elements
//Naive solution takes O(n^2) TC . there are two loops n(n-1)/2 times repeats .
/*
 * for ( int i = 0 ; i < n-1 ; i++)
 * for ( int j = 0 ; j < n-i-1 ; j++)
 * if ( arr[j] > arr[j+1])
 *  swap(arr[j],arr[j+1]);
 */
//Efficient Solution for Bubble Sort
class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {9,4,35,3,5,6,3,1};
       bubblesort(arr);
       for (int i : arr)
       System.out.println(i);
    }
    static void bubblesort( int[] arr ){
         for ( int i = 0 ; i < arr.length-1 ; i++ ){
            boolean skip = false;
            for ( int j = 0 ; j < arr.length-i-1 ; j++ ){
                if ( arr[j] > arr[j+1] ){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]   = temp;
                    skip = true;
                }
            }
            if ( skip == false ){
                return;
            }
        }
    }
}
// Number of iterations are reduced through optimized solution by checking any swaps are done in the iterations we can break the loop
//stability is the good case in this type of algorithm