class recursion16josephus{
    public static void main(String[] args) {
        int i = jos ( 100 , 3 );
        System.out.println(i);
    }
    static int jos(int n , int k){
        if (n == 0) return 0;
        return (jos(n-1,k)+k)%n;
    }
    
}