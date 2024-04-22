import java.util.Arrays;

class Circularqueue {
    private int[] queue;
    private int front, rear, size, capacity;

    public Circularqueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        rear++;
        if (rear == capacity) {
            rear = 0;
        }
        queue[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int item = queue[front];
        front++;
        if (front == capacity) {
            front = 0;
        }
        size--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    @Override
    public String toString() {
        return "Circularqueue{" +
                "queue=" + Arrays.toString(queue) +
                '}';
    }

    public void display(){
        if(front==-1 && rear==-1){
            System.out.println("Queue is Empty");
        }else {
            System.out.println("Queue is : ");
            int i = front;
            while (i!=rear){
                System.out.print(queue[i]+" ");
                i = (i+1)%queue.length;
            }
            System.out.print(queue[rear]);
        }

    }
}
