public class TwoStacks {
    int arr[] , cap , top1 , top2;
    public TwoStacks( int n ){
        cap = n ;
        top1 = -1 ;
        top2 = cap;
        arr = new int[n];
    }  
    void push1 (int x ){
        if ( top1 < top2-1 )
        arr[++top1] = x;
    }
     void push2 (int x ){
        if ( top1 < top2-1 )
        arr[--top2] = x;
    }
    int pop1(){
        if ( top1 >= 0 )
        return arr[top1--];
        return 1;
    }
    int pop2(){
        if ( top2 < cap )
        return arr[top2++];
        return 1;
    }
}
class Main{
public static void main(String[] args) {
    TwoStacks s = new TwoStacks(10);
    s.push1(2);
    s.push2(3);
    System.out.println(s.pop1());
    System.out.println(s.pop2());
}
}
