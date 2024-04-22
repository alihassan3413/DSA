package ArraysandLists;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {1,33,44,2,7,90,45,39};
        int res = maxVal(arr);
        System.out.println(res);
    }
    static int maxVal(int[] arr){
        int compare = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > compare){
                compare = arr[i];
            }
        }
        return compare;
    }
}
