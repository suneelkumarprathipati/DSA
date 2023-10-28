public class floorSqrt {
    public static void main(String[] args) {
        int num = 7 ; 
        int ret = floorsquare( num );
        System.out.println(ret);
    }
    static int floorsquare(int num){
        int left = 0 ;
        int right = num ;
        int ans = 0;
        while ( left <= right ){
          int mid = (left+right)/2;
          int sqr = mid*mid;
            if ( sqr == num){
                return mid;
            }
            else if (sqr > num){
                 right = mid-1;
            }
            else {
                left = mid+1;
                ans = mid;
            }
            
        }
        return ans;
    }
}
