package StacksAndQueues;

public class _02CicularQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public _02CicularQueue(int size) {
        this.data = new int[size];
    }

    public _02CicularQueue() {
        this(DEFAULT_SIZE);
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == -1;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end%data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Classwork.Queue is Empty");
        }
        int removed = data[front++];
        front = front%data.length;
        size--;
        return removed;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }

        int i = front;
        do{
            System.out.println(data[i] + "<-");
            i++;
            i %= data.length;

        }while (i != end);
        System.out.println("End!!");
    }
}
