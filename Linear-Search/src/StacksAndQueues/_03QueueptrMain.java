package StacksAndQueues;

public class _03QueueptrMain {
    public static void main(String[] args) {
        _03Queue2ptr queue = new _03Queue2ptr(5);
        queue.insert(5);
        queue.insert(4);
        queue.insert(3);
        queue.insert(2);
        queue.insert(1);

        queue.display();

        System.out.println(queue.remove());
        queue.display();
    }
}
