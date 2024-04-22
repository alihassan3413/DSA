package Classwork;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NewQueue {
    int[] array;
    int front = -1;
    int rear = -1;

    public NewQueue(int size) {
        this.array = new int[size];
        Arrays.fill(array,Integer.MIN_VALUE);
    }

    public void enqueue(int val){
        if(rear == -1 && front == -1){
            front=rear=0;
            array[rear] = val;
        } else if (array[rear] == Integer.MIN_VALUE) {
            array[rear] = val;
        } 
    }
}
