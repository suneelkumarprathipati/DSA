import java.util.ArrayList;

public class UnionTwoSortedArraya {
    public static void main(String[] args) {
        int[] arr1 = { 2,20,20,40,60 };
        int[] arr2 = { 3,20,20,40 };
        unionarray(arr1,arr2,arr1.length,arr2.length);
    }
    static void unionarray( int[] arr1,int[] arr2 ,int m , int n ){
        int i = 0 ,j = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (i < m && j < n){
            if ( i > 0 && j > 0){
                 if ( arr1[i] == arr1[i-1]) {
                i++;
                continue;
            }
            if ( arr2[j] == arr2[j-1]) {
                j++;
                continue;
            }
            }
           
            if ( arr1[i] > arr2[j] ) {
                arr.add(arr2[j]);
                j++;
            }
            else if ( arr1[i] < arr2[j]){
                arr.add(arr1[i]);
                i++;
            }
            else if ( arr1[i] == arr2[j] ){
                arr.add(arr1[i]);
                i++;
                j++;
            }
        }
        while ( i < m ){ 
            arr.add(arr1[i]);
            i++;
        }
        while ( j < n ){
            arr.add( arr2[j]);
            j++;
        } 
        System.out.println(arr);
    }
}
