package Classwork;

import java.util.Arrays;

public class CircularQueue {
        int[] array;
        int front = -1;
        int rear = -1;

    public CircularQueue(int size) {
        this.array = new int[size];
    }

    public void enqueue(int val){
            if(front==-1 && rear==-1){
                front=rear=0;
                array[rear] = val;
            } else if ((rear+1)%array.length == front) {
                System.out.println("Queue is Full!!");
            }else {
                rear = (rear+1)%array.length;
                array[rear] = val;
            }
        }

        public void dequeue(){
            if(front==-1 && rear==-1){
                System.out.println("Queue is Empty!!");
            } else if (front==rear) {
                System.out.println(array[front]);
                front=rear=-1;
            }else {
                System.out.println(array[front]);
                front = (front+1)%array.length;
            }
        }


    public void display(){
        if(front==-1 && rear==-1){
            System.out.println("Queue is Empty");
        }else {
            System.out.println("Queue is : ");
            int i = front;
            while (i!=rear){
                System.out.print(array[i]+" ");
                i = (i+1)%array.length;
            }
            System.out.print(array[rear]);
        }
    }
}
