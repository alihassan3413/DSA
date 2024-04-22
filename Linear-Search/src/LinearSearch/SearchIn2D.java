package LinearSearch;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {-7,4,3,5},
                {1,28,8,9}
        };

        int tar = 1;
        System.out.println("Index of element in 2D array : "+Arrays.toString(searchIn2D(arr, tar)));
        System.out.println("Element : "+searchIn2D2(arr,7));
        System.out.println("Minimum : "+findMin(arr));
        System.out.println("Maximum : "+findMax(arr));
    }

    // return the index in array format
    static int[] searchIn2D(int[][] arr, int target){
        if(arr.length ==0){
            return new int[]{-1};
        }
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }


    // for returning element
    static int searchIn2D2(int[][] arr, int target){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                if(arr[i][j]==target){
                    return arr[i][j];
                }
            }
        }
        return Integer.MAX_VALUE;
    }


    // for finding the min

    static int findMin(int[][] arr){
        int compare = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(compare > arr[i][j]){
                    compare = arr[i][j];
                }
            }
        }
        return compare;
    }


    // for finding the max
    static int findMax(int[][] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
