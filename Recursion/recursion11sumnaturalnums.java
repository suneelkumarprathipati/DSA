class recursive11sumnaturalnums{
    public static void main(String[] args) {
        int i = getSum(10);
        System.out.println(i);
    }
    static int getSum(int n){
        if ( n == 0 ) return 0;
        return n + getSum(n-1);
    }
}