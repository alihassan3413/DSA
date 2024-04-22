package Classwork;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String input = "(A*B+C/D)";

        System.out.println(infixToPostfix(input));
    }

    static public StringBuilder infixToPostfix(String input){
        StringBuilder output = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        char c ;

        for (int i = 0; i < input.length(); i++) {
            c = input.charAt(i);

            if(c == '('){
                stack.push(c);
            } else if (c == ')') {
                while (stack.peek() != '('){
                    output.append(stack.pop());
                }
                stack.pop(); // for rem (
            } else if (c=='+' || c=='-' || c=='*' || c=='/') {
                while (precedence(c) <= precedence(stack.peek())){
                    output.append(stack.pop());
                }
                stack.push(c);
            } else {
                output.append(c);
            }
        }

        return output;
    }

    static public int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return 0;
    }

}
