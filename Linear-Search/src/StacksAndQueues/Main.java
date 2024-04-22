package StacksAndQueues;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws StacksCustomException {
//        _02CustomStacks stack = new _02CustomStacks(5);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//
//        System.out.println("Peek item before removing : "+stack.peek());
//
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        _03DynamicStacks stacks2 = new _03DynamicStacks(5);
//        stacks2.push(10);
//        stacks2.push(20);
//        stacks2.push(30);
//        stacks2.push(40);
//        stacks2.push(50);
//        stacks2.push(60);
//
//
//        System.out.println("Peek or latest item in stack : "+stacks2.peek());
//
//        System.out.println(stacks2.pop());
//        System.out.println(stacks2.pop());
//        System.out.println(stacks2.pop());
//        System.out.println(stacks2.pop());
//        System.out.println(stacks2.pop());
//        System.out.println(stacks2.pop());

        Stacks stack = new Stacks(3);
        stack.push(10);
        stack.push(5);
        stack.push(20);

//        stack.pop();
        System.out.println(stack);
    }

}
