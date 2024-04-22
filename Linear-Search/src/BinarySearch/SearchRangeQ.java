package BinarySearch;

import java.util.Arrays;

public class SearchRangeQ {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr, 10)));
    }

    static int[] searchRange(int[] arr,int target){

        int[] ans = {-1,-1};

        int start = ocurence(arr,target,true);
        int end = ocurence(arr,target,false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // this functions jus for findng te first and last occirence of the target

    static int ocurence(int[] arr,int target , boolean findStartIndex){
        // potential answer
        int ans = -1;
        int start = 0;
        int end =arr.length -1 ;

        while (start <= end){
            int mid =start + (end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if(target> arr[mid]) {
                start = mid + 1;
            } else {
               // potential answer
                ans =mid;
                if(findStartIndex){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }



}
