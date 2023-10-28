// sum of digits using recirsion 
public class recursion14sumdigits {
    public static void main(String[] args) {
        int num = 253;
        int sum = getsum(num);
        System.out.println(sum);
    }
    static int getsum( int n){
        if (n <= 0) return 0;
        return n%10 + getsum(n/10);
    }
}
// for this problem T.C - O(digits) and S.C - O(digits)
//insted of this we can use iterative solution due to T.C - O(digits) and S.C - O(1)