 class array12stocksellbuy {
    public static void main(String[] args) {
        int arr[] = {1,3,5,2,7,8};
        int pr = maxprofit(arr);
        System.out.println(pr);
    }
    static int maxprofit( int arr[] ){
        int profit = 0;
        for ( int i = 1 ; i < arr.length ; i++ ){
            if ( arr[i] > arr[i-1]){
                profit += arr[i]-arr[i-1];
            }
        }
        return profit;
    }
}
