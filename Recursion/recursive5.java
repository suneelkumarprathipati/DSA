//Binary conversion using Recursion
public class recursive5 {
    public static void main ( String[] args){
      bin(10);
    }
    public static void bin( int n){
        if ( n==0 ) 
        return ;
        bin(n/2);
        System.out.print(n%2);
    }
}
