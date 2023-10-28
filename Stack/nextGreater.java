import java.util.Stack;

public class nextGreater {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3};
        nextgreater( arr , arr.length);
    }
    static void nextgreater( int[] arr, int n ){
        Stack<Integer> s = new Stack<>();
        int[] ar = new int[n];
        s.push(arr[n-1]);
        ar[n-1] = -1;

        for ( int i = n-2 ; i >= 0 ; i-- ){
            while ( s.isEmpty() == false && s.peek() <= arr[i])
            s.pop();
            int ng = s.isEmpty() ? -1 : s.peek();
           ar[i] = ng;
            s.push(arr[i]);
        }
        for ( int i = 0 ; i < n ; i++ )
        System.out.print(ar[i]+ " ");
    }
}
