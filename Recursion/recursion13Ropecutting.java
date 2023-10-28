public class recursion13Ropecutting {
    public static void main(String[] args) {
        int n = 23 ;
        int a = 12;
        int b = 9;
        int c = 11;
        int ret = ropecut( n,a,b,c );
        System.out.println(ret);
    }
    public static int ropecut( int n , int a, int b, int c){
        if ( n == 0) return 0;
        if ( n < 0 ) return -1;
        int res = Math.max(ropecut(n-a,a,b,c),Math.max(ropecut(n-b,a,b,c),ropecut(n-c,a,b,c)));
        if (res == -1) {
            return -1;
        } 
        return res+1;
    }
}
