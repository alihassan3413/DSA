package Classwork;

import java.lang.reflect.Array;

public class Queue {
    int[] arr = new int[5];
    int ptr = -1;

    public void enqueue(int value){
        if(ptr == arr.length-1){
            System.out.println("Classwork.Queue is FULL");
        }
        arr[++ptr] = value;
    }

    public boolean dequeue(){
        if(ptr==-1){
            System.out.println("Quene is EMpty");
            return false;
        }
        System.out.println("Removed : " + arr[0]);
        for (int i = 1; i <= ptr; i++) {
            arr[i-1] = arr[i];
        }

        ptr--;
        return false;
    }
    public void display(){
        for (int i = 0; i <= ptr; i++) {
            System.out.println(arr[i]);
        }
    }
}
