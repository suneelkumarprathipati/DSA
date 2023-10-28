// 1. DIvide and Conqur Algorithm (divide , conqur and merge)
// 2.It is a stable algorithm 
// 3.It takes O(nlogn) time and O(n) space complexities which are best time and space
// 4.well suited for linkedlist.works in O(1) aux space.
// 5. Used in external sorting
// 6. In general for arrays , quick sort out performs it.
public class MergeSortTwosortArr {
    public static void main(String[] args) {
    int[] a = { 10 , 15 , 20 , 30};
    int[] b = { 1 , 12 };
    mergesort( a,b,a.length,b.length);
    }
    static void mergesort( int a[] , int b[] , int m , int n ){
        int i = 0 , j = 0;
        while ( i < m && j < n ){
            if ( a[i] <= b[j]){
            System.out.print(a[i]+" ");
            i++;
         
            }
            else {
            System.out.print(b[j]+" ");
            j++;
           
            }    
        }
        while ( i < m)
        {
            System.out.print(a[i]+" ");
            i++;
        }
          while ( j < n)
        {
            System.out.print(b[j]+" ");
            j++;
        }

    }
}
