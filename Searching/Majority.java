public class Majority {
    public static void main(String[] args) {
        int[] arr = { 1,2,5,3,3,4,3,3,3,3,5 };
        System.out.println(major(arr));
    }
    static int major( int arr[] ){
        int res = 0 , count = 1;
        for ( int i = 0 ; i < arr.length-1 ; i++ ){
            if ( arr[i] == arr[res] )
                count++;
            else 
                count--;
            if (count==0){
                res = i; count = 1;
            }
        }
        count = 0;
        for ( int i = 0 ; i < arr.length ; i++ ){
            if ( arr[i] == arr[res] )
                count++;
        }
        if ( count <= arr.length/2)
            return -1;
        return arr[res];
    }
}
// Naive Solution takes O(n^2) to reduce we use the Moore's Booting Algorithm to make the time complexity to O(n).
// First it takes the most appeared element in the array in one loop and count the majority element and checking it and print the element.