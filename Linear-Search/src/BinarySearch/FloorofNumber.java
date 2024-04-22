package BinarySearch;

// Floor Define - Greatest element in an array smaller or equal to the target


public class FloorofNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(floorOfNumber(arr,20));
    }

    static int floorOfNumber(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;


        if(target > arr[arr.length-1]){
            return arr[arr.length-1];
        }

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



        return arr[end];
    }
}
