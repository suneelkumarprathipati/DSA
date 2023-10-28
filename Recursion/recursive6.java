// print n to 1 numbers
public class recursive6 {
    public static void main ( String[] args){
      fun(10);
    }
    public static void fun( int n){
       if ( n==0 ) return ;
       System.out.println(n);
       fun(n-1);
    }
}