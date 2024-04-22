package Classwork;

import java.util.Stack;

public class QueueAsStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();


    public void enqueue(int val) {
        stack1.push(val);
    }

    public void transfer() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    public void dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                System.out.println("Queue is empty.");
                return;
            }
            transfer();
        }
        System.out.println(stack2.pop());
    }

    @Override
    public String toString() {
        return "QueueAsStacks{" +
                "stack1=" + stack1 +
                ", stack2=" + stack2 +
                '}';
    }

    public static void main(String[] args) {
        QueueAsStacks q1 = new QueueAsStacks();
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);

        q1.dequeue();
        q1.dequeue();
        q1.dequeue();

        q1.enqueue(4);
        q1.dequeue();

        System.out.println(q1);
    }
}
