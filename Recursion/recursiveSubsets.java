//Subsets using simple recursion....❤️
public class recursiveSubsets {
    public static void main(String[] args) {
        String s = "ABCDEFG";
        Subsets(s,"",0);
    }
    static void Subsets( String s , String curr , int i ){
        if (i == s.length()){
            System.out.println(curr );
            return ;
        }
        Subsets(s, curr, i+1);
        Subsets(s, curr+s.charAt(i), i+1);
    }
}
