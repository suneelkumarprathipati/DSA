public class SearchInInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99,100};
        int target = 55;
      int ret = searchinfinite( arr, target);
      System.out.println(ret);
    }
    static int searchinfinite( int[] arr ,int target ){
        if (arr[0]== target) return 0;
        int i = 1 ; 
        while ( arr[i] < target ){
            i = i*2;
        }
        if (arr[i] == target) return i;
        return binarysearch(arr, target , i/2+1, i+1);
    }
    static int  binarysearch( int[] arr , int target,int left , int right){
        while ( left <= right ){
            int mid = (left+right)/2;
            if ( arr[mid] == target ){
                return mid;
            }
            else if ( arr[mid] > target ){
                right = mid-1;
            }
            else if ( arr[mid] < target ){
                left = mid+1;
            }
        }
        return -1;
    }
}
