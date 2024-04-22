package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        // give sorted array
        // ascending array
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Ascending : "+binarySearch(arr,7));

        // descending array
        int[] arr2 ={9,8,7,6,5,4,3,2,1};
        System.out.println("Descending : "+binarySearchD(arr2,7));
    }

    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
//        int mid = (start + end)/2; better wa to find mid ecz itmight possblw qwith this method int value eceds if we have very lage start or end
        for (int i = start; i <= end; i++) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                end = mid - 1;
            }
            if (arr[mid]<target){
                start = mid+1;
            }
        }



        return -1;
    }

    // for descending array

    static int binarySearchD(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        for (int i = start; i < end; i++) {
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            } else if (target > arr[mid]) {
                // search left
                end = mid -1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
