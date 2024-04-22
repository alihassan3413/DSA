package ArraysandLists;

import java.sql.Array;
import java.util.Arrays;

public class Class {
    static int flag = -1;
    static int[] array = {1,2,3,4,5};

    public static void main(String[] args) {
        push(6);
        System.out.println(Arrays.toString(array));
    }

    static void push(int value){
        if(flag >= array.length-1){
            int[] arr = new int[array.length*2];
            for(int i=0;i<arr.length;i++){
                arr[i] = array[i];
            }
            arr[flag++] = value;
            array = arr;
        }
        else {
            array[flag++] = value;
        }
    }
}
