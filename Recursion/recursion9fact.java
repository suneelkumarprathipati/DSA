// Factorial of number
public class recursion9fact {
    public static void main(String[] args) {
       int i = fact(8);
       System.out.println(i);
    }
    static int fact( int n ){
        if ( n==0 ) return 1;
       return n*fact(n-1);

    }
    
}
