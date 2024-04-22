package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        System.out.println(linearSearch(arr,target,1,4));

    }

    // for searching in a specific range in an array and this function return the index
    static int linearSearch(int[] arr, int target , int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int i=start; i<=end; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
