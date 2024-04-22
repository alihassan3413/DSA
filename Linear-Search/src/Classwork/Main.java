package Classwork;

public class Main {
    public static void main(String[] args) {
//
//       Classwork.ClassWork stacks = new Classwork.ClassWork(5);
//        stacks.push(1);
//        stacks.push(2);
//        stacks.push(3);
//        stacks.push(4);
//        stacks.push(5);
//        stacks.push(6);
//
//        stacks.display();
//
//        stacks.pop();
//        stacks.pop();
//        stacks.pop();
//        stacks.pop();
//        stacks.pop();
//        stacks.pop();

        QueueList queue = new QueueList(10);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        System.out.println(queue);

//        queue.display();
        System.out.println("Dequeue : ");

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

//        queue.display();
    }
}
