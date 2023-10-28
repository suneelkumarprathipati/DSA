public class recursion12palindrome {
    public static void main(String[] args) {
        String s = "bcabacb";
        int start = 0;
        int end = s.length()-1;
        boolean f = isPalindrome(s ,start,end );
        System.out.println(f);
    }
    static boolean isPalindrome(String s , int start ,int end){
        if ( start >= end) return true;
        return (s.charAt(start) == s.charAt(end)) && isPalindrome(s,start+1,end-1);
    }
}
