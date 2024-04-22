package BinarySearch;

// Ceiling Define - smallest element in an array greater or equal to the target
public class CeilingofNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(ceilingfOfNumber(arr,20));
    }

    // my solution
    static int ceilingfOfNumber2(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;


        if(target > arr[arr.length-1]){
            return -1;
        }

        for (int i = start; i <= end ; i++) {
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            if (arr[mid] < target) {
                start = mid + 1;
                for (int j = start; j <= end; j++) {

                    if(arr[j] >= target){
                        return arr[j];
                    }
                }
            }
            if (arr[mid] > target){
                end = mid - 1;
                for (int j = start; j <= end; j++) {
                    if(arr[j] >= target){
                        return arr[j];
                    }
                }
            }
        }
        return -1;
    }


    // online solution
    static int ceilingfOfNumber(int[] arr, int target){

        // if the target number is greater then all the greatest element in array
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
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



        return arr[start];
    }
}
