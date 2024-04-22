package Classwork;

public class Queue2ptr {
    int[] arr;
    int front=-1;
    int end = -1;

    public Queue2ptr(int size) {
        this.arr = new int[size];
    }

    public void enqueue(int value){
        if(end == arr.length-1){
            System.out.println("Classwork.Queue is Full");
        }
        end++;
        front = 0;
        arr[end] = value;
    }

    public int dequeue(){
        int rem;
        if(end == -1 && front ==-1){
            System.out.println("Classwork.Queue is Empty");
            return 0;
        }else if (end != front)
        {
         rem = arr[front++];
         return rem;
        }if(front == end){
           rem = arr[front];
           front = end = -1;
           return rem;
       }
        return 0;

    }

    public void display(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"-->");
        }
        System.out.println("END!!!");
    }
}
