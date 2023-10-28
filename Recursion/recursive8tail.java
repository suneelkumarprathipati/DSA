// tail recursion 
public class recursive8tail {
    public static void main(String[] args) {
       int i = fun(3,1);
       System.out.println(i);
    }
    static int fun( int n , int k){
        if ( n==0 || n==1 ) return k;
       return fun (n-1, k*n);

    }
}
