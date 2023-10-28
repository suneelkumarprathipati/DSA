import java.util.ArrayList;

public class IntersectionTwoSortdArrays {
    public static void main(String[] args) {
        int[] arr1 = { 2,20,20,40,60 ,70,90,888};
        int[] arr2 = { 2,20,20,40,70 };
       ArrayList<Integer> arr = new ArrayList<Integer>() ;
     intersection(arr, arr1, arr2 , arr1.length , arr2.length );
       System.out.println(arr);
    }
   public static ArrayList intersection( ArrayList arr,int[] a , int[] b , int m , int n ){
        int i = 0 , j = 0 ;
        while ( i < m  && j < n ){
            if ( i > 0 && a[i] == a[i-1])
           {
            i++; 
            continue;
               } 
            else if ( a[i] > b[j])
                j++;
            else if ( a[i] < b[j]) i++;
            else if ( a[i] == b[j]) 
            {
                arr.add(a[i]);
                i++;
                j++;
            }
        }
        return arr;
    }
}
