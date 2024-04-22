package StacksAndQueues;

import java.util.ArrayList;

public class Stacks {

    ArrayList<Integer> arr;
    int ptr = -1;

    public Stacks(int size) {
        this.arr = new ArrayList<>(size);
    }

    public void push(int item){
        ptr++;
        arr.set(ptr, item);
    }



    public void pop(){
        System.out.println(arr.get(ptr--));
    }
}
