package BinarySearch;

// as we are searching for in the infinite array so we cannot use the length func
public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {30,40,50,90,123,130,150};
        int target = 90;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int newStart = end + 1;

            // double the box value
            // end= previuos end + sizeofBox*2
            end = end + (end-start+1) * 2;

            // after this update the start
            start = newStart;
        }
        int ans = binarySearch(arr,target,start,end);
        return ans;
    }
    static int binarySearch(int[]arr,int target, int start, int end){
        while (start <= end){
            int mid =start + (end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if(target> arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
