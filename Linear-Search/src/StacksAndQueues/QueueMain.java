package StacksAndQueues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        _01CustomQueue queue = new _01CustomQueue(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);

        queue.display();


        System.out.println(queue.remove());
        System.out.println("After removal");
        queue.insert(133);
        queue.display();

    }
}
