package StacksAndQueues;

public class _01CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end = 0;

    public _01CustomQueue(int size) {
        this.data = new int[size];
    }

    public _01CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == -1;
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.println("Classwork.Queue is full");
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Classwork.Queue is Empty");
        }
        int removed = data[0];
        // shift all items to left
        for (int i=1;i<end;i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Nothing to show");
        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.println(data[i] + " ");
        }
        System.out.println("END!!!");
    }
}
