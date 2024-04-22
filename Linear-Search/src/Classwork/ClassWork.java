package Classwork;

public class ClassWork {
    int[] data;
    static int DEFAULT_SIZE = 10;

    int ptr = -1;

    public ClassWork(int size) {
        this.data = new int[size];
    }

    public ClassWork() {
        this(DEFAULT_SIZE);
    }

    public boolean push(int value){
        if(ptr == data.length-1){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = value;
        return true;
    }

    public boolean pop(){
        if(ptr == -1){
            System.out.println("Stack is empty");
            return false;
        }
        System.out.println(data[ptr--]);
        return true;
    }

    public void display(){
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        System.out.println("END!!!");
    }
}
