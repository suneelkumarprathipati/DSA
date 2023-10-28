// print 1 to n numbers
public class recursive7 {
    public static void main ( String[] args){
      fun(10);
    }
    public static void fun( int n){
       if ( n==0 ) return ;
       fun(n-1);
       System.out.println(n);
    }
}