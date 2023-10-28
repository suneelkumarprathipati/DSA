import java.util.Arrays;

public class array7movezeros {
    public static void main(String[] args) {
        int arr[] = { 1,3,0,5,0,5,4,0};
        movezeros( arr );
    }
    static void movezeros(int arr[]){
        for ( int i = 0 ; i < arr.length ; i++ ){
            int count = 1;
            if ( arr[i] != 0 ){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
                System.out.println(Arrays.toString(arr));

    }
}
