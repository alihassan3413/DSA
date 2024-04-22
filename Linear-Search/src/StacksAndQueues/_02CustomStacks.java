package StacksAndQueues;

public class _02CustomStacks {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public _02CustomStacks(int size) {
        this.data = new int[size];
    }

    public _02CustomStacks() {
       this(DEFAULT_SIZE);
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StacksCustomException {
        if(isEmpty()){
           throw new StacksCustomException("Stack is empty");
        }
        return data[ptr--];
    }

    public int peek() throws StacksCustomException {
        if(isEmpty()){
            throw new StacksCustomException("Cannot peek from empty stacks");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length -1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
