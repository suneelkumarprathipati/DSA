public class array3secondlarge {
    public static void main(String[] args) {
        int arr[] = { 5,20,12,19,10};
        int n = secondlarge ( arr );
        System.out.println(arr[n]);
    }
    static int secondlarge( int arr[]){
        int res = -1 , largest = 0 ;
        for (int  i = 1; i < arr.length ; i++ ){
            if ( arr[i] > arr[largest] ){
                res = largest;
                largest = i ;
            }
            else if ( arr[i] != arr[largest] ){
                if(res== -1 || arr[i] > arr[res]){
                    res = i;
                }
            }
        }
        return res;
    }
}
