import java.util.Stack;

public class PrevGreater {
    public static void main(String[] args) {
        int[] arr = { 2 , 5 ,13 , 1 , 23 , 10 , 20};
        prevgreat( arr );
    }
    static void prevgreat( int[] arr ){
        Stack<Integer> s = new Stack<>();
        s.push(arr[0]);
        for (int i = 0 ; i < arr.length ; i++ ){
            while ( s.isEmpty() == false && s.peek() <= arr[i] )
            s.pop();
            int sg = (s.isEmpty())? -1 : s.peek();
            System.out.print(sg+" ");
            s.push(arr[i]);
        }
    }
}
