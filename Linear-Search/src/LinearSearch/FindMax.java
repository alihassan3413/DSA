package LinearSearch;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {10,2,30,-1,90,40,50};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        if(arr.length ==0){
            return -1;
        }

        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
