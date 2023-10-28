public class array6removedup {
    public static void main(String[] args) {
        int arr[] = { 10,20,20,30,30,30,30};
       int r =  removedups( arr );
        for ( int i = 0 ; i < r ; i++ ){
             System.out.print(arr[i]+" ");
        }
    }
    static int removedups( int arr[] ){
        int res = 1;
        for ( int i = 1 ; i < arr.length ; i++ ){
            if ( arr[i] != arr[res-1] ){
                arr[res] = arr[i];
                res++;
            }
        }
       return res;
      //  System.out.println(arr.toString());
    }
}
