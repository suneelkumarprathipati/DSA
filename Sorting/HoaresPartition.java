public class HoaresPartition{

    public static void main(String[] args) {
        int[] arr = { 9, -3, 5, 2, 6, 8, -6, 1, 3 };
        hoars(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void hoars(int[] arr, int low, int high) {
        int pivot = arr[low];
        int left = low - 1;
        int right = high + 1;

        while (true) {
            do {
                left++;
            } while (arr[left] < pivot);

            do {
                right--;
            } while (arr[right] > pivot);

            if (left >= right) {
                return ;
            }

            // Swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }
}

// In lomuto partition the pivot will placed at its correct position
// In Hoare's partition the pivot will not places at its correct position 
//Insted It can partitioned into two parts which are greater than equal to pivot and less than equal to parts
//It is unstable