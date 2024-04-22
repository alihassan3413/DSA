package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {10,40,5,60,3};
        System.out.println(min(arr));
    }

    static int min(int[] arr){

        if(arr.length == 0){
            return -1;
        }

        int compare = arr[0];
        for(int i=1 ; i<arr.length; i++){
            if(compare > arr[i]){
                compare = arr[i];
            }
        }
        return compare;
    }
}
