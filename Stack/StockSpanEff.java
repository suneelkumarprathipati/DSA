import java.util.Stack;

public class StockSpanEff {
    public static void main(String[] args) {
        int[] ar = { 60 , 20 , 40 , 35 , 30 , 50 , 70 , 65 };
        stockspan( ar );
    }
    static void stockspan( int[] arr ){
        Stack<Integer> s = new Stack<>();
        s.push(0);
        System.out.print(1+" ");
        for ( int i = 1 ; i < arr.length ; i++ ){
            while ( s.isEmpty() == false && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            int span = s.isEmpty() ? i+1 : i-s.peek();
            System.out.print(span+" ");
            s.push(i);
        }
    }
    
}
