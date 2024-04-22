package Classwork;

import java.util.ArrayList;

public class QueueList {
    ArrayList<Integer> list;
    int end = -1;
    int front = -1;

    public QueueList(int size) {
        this.list = new ArrayList<>(size);
    }


    public void enqueue(int value){
        list.add(++end,value);
    }


    public void dequeue(){
        ++front;
        int rem = list.get(front);
        System.out.println(rem);
    }


    @Override
    public String toString() {
        System.out.println(list.size());
        return "Classwork.QueueList{" +
                "list=" + list +
                '}';
    }
}
