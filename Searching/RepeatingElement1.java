//Our question is to print a Only one repeating element in the array remaining will appear once 
// TC - O(n)
// SC - O(1)
// no modifications in the original array
public class RepeatingElement1 {
    public static void main(String[] args) {
       int[] arr ={ 0,2,1,3,2,2};
       System.out.println(repeat(arr)); 
    }
    static int repeat(int[] arr){
        boolean[] visited = {false,false,false,false,false,false};
        for ( int i = 0 ; i < arr.length; i++ )
        {
            if ( visited[arr[i]] )
            return arr[i];
            visited[arr[i]] = true;
        }
        return -1;
    }
}
