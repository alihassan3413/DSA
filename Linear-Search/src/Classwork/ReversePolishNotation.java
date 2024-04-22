package Classwork;

import java.util.Scanner;
import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // static array
//        String[] input = new String[5];
//        for (int i = 0; i < input.length; i++) {
//            input[i] = sc.nextLine();
//        }
//        System.out.println(RPN(input));

        // static use
        String[] inp = {"1","10","5","/","+"};
        System.out.println(RPN(inp));

    }


    static public void reversePolis(String input2){
        String input = input2.replaceAll("\\s+","");
        System.out.println(input);
        Stack<Integer> stack = new Stack<>();
        int firstPop;
        int secondPop;


        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c == '+' || c == '-' || c == '*' || c =='/'){
                switch (c){
                    case '+':
                        stack.push(stack.pop() + stack.pop());
                        break;

                    case '-':
                        firstPop = stack.pop();
                        secondPop = stack.pop();
                        stack.push(secondPop-firstPop);
                        break;

                    case '*':
                        stack.push(stack.pop() * stack.pop());
                        break;

                    case '/':
                        firstPop = stack.pop();
                        secondPop = stack.pop();
                        stack.push(secondPop / firstPop);
                        break;
                }
            } else {
                stack.push(Character.getNumericValue(c));
            }
        }
        System.out.println(stack);
    }


    public static int RPN(String[] input){
        Stack<Integer> stack = new Stack<>();
        int firstPop;
        int secondPop;

        for (int i=0;i<input.length;i++){
            switch (input[i]){
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;

                case "-":
                    firstPop = stack.pop();
                    secondPop = stack.pop();
                    stack.push(secondPop-firstPop);
                    break;

                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;

                case "/":
                    firstPop = stack.pop();
                    secondPop = stack.pop();
                    stack.push(secondPop / firstPop);
                    break;
                default:
                    stack.push(Integer.parseInt(input[i]));
            }
        }
        return stack.pop();
    }
}
