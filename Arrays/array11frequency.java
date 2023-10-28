//freqency of each element in an array
public class array11frequency {
    public static void main(String[] args) {
        int arr[] = { 1,2,2,3,3,3,4,5,5,5,6,6};
        frequency(arr);
    }
    static void frequency( int arr[] ){

        int freq = 1 , i = 1,n = arr.length;
        while( i < n){
            while ( i < n  && arr[i] == arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1] +" "+ freq);
            i++;
            freq = 1;
        }
        if ( n==1 && arr[n-1] != arr[n-2]){
            System.out.println(arr[n-1]+" "+1);
        }

    }
}
