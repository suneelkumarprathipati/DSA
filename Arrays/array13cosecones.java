public class array13cosecones {
    public static void main(String[] args) {
        String s = " 01101110";
        int n = mostconsecones( s);
        System.out.println(n);
    }
    static int mostconsecones( String s ){
        int count = 0,res= 0;
        for ( int i = 0 ;i < s.length(); i++ ){
            if ( s.charAt(i) == '0'){
                count = 0;
            }
            else{
                count++;
                res = Math.max( count, res);
            }
        }
        return res;
    }
}
