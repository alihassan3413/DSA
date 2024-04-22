package ArraysandLists;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[] arr = {20,60,10,30,40};
        int[] result = reverseArray(arr);
        int[] result2 = reverseList(arr);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));
    }

    static int[] reverseArray(int[] arr){
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        int[] newArr = new int[arr.length];

        while (arr.length > firstIndex){
            newArr[firstIndex] = arr[lastIndex];
            lastIndex--;
            firstIndex++;
        }
        return newArr;
    }

    public static int[] reverseList(int arr[])
    {
        int[] reverseList= new int[arr.length];

        for (int i=0;i<arr.length;i++){

            reverseList[i]= arr[arr.length-1-i];
        }
        return reverseList;
    }
}


