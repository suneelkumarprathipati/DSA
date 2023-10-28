import java.util.Stack;

/**
 * BalancedParenthesis
 */
public class BalancedParenthesis {
public static void main(String[] args) {
    String s = "{()}";
    boolean ret = isBalanced( s );
    System.out.println(ret);
}
public static boolean isBalanced(String s ){
    Stack<Character> st = new Stack<>();
    if ( s == null || s.length()== 0) return false;
    for ( int i = 0 ; i < s.length() ; i++ ){
        if ( s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') st.push(s.charAt(i));
        else {
            if ( st.isEmpty() ) return false;
            else if (isMatch(st.peek(),s.charAt(i)) == false ) {
                return false;
            }
            else st.pop() ;
        }
    }
    return st.isEmpty();
}
static boolean isMatch ( char a , char b ){
    return ((a == '{') && (b == '}') || (a == '[') && (b == ']') || (a == '(') && (b == ')')) ;
}
}