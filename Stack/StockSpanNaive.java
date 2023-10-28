public class StockSpanNaive {
    public static void main(String[] args) {
        int[] arr = { 18 , 13 , 11 ,12 , 14 , 11 , 16 };
        stockspan( arr );
    }
    static void stockspan( int[] arr ){
        for ( int i = 0 ; i < arr.length ; i++ ){
             int span = 1;
             for ( int j = i-1 ; j >= 0 && arr[j] <= arr[i] ; j-- )
             span++;
             System.out.print(span+" ");
        }
    }
}
