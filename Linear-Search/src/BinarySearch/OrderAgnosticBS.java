package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr2 ={9,8,7,6,5,4,3,2,1};

        System.out.println("Ascending : " + OAbinarySearch(arr,7));
        System.out.println("Descending : " + OAbinarySearch(arr2,7));
    }

    static int OAbinarySearch(int[] arr, int target){
        // first we wil find out wether the array is ascending sorted or descending
        int start =0;
        int end = arr.length -1;

        // for ascending
        if(arr[start] < arr[end]){
            for (int i = start; i < end; i++) {
                int mid = start + (end - start)/2;
                if(arr[mid] == target){
                    return mid;
                }else if (arr[mid] < target){
                    // search in right
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    // search in left
                    end = mid- 1;
                }
            }
        }
        // for descending
        else if (arr[start] > arr[end]) {
            for (int i = start; i < end; i++) {
                int mid = start + (end-start)/2;
                if(arr[mid] == target){
                    return mid;
                } else if (arr[mid]>target) {
                    // search in right
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    // search in left
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
