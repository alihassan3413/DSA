package StacksAndQueues;

public class _03Queue2ptr {
    int[] data;
    private static final int DEFINE_SIZE = 10;
    private int end = -1;
    private int front = -1;

    public _03Queue2ptr(int size) {
        this.data = new int[size];
    }

    public _03Queue2ptr() {
        this(DEFINE_SIZE);
    }

    public void insert(int x){
        if(front==-1 && end==-1){
            front=0;
            end=0;
            data[end]=x;
        }else if(end == data.length-1){
            System.out.println("Classwork.Queue is Full");
        }else {
            data[++end]=x;
        }
    }

    public int remove(){
        if(end == -1){
            System.out.println("Stack is empty");
        }
        int removed = data[0];
        for (int i = 1; i < end ; i++) {
            data[i]= data[i+1];
        }
        end--;
        return removed;
    }

    public void display(){
        for (int i = 0; i <= end; i++) {
            System.out.print(data[i]+"->");
        }
        System.out.println("END!!!");
    }
}
