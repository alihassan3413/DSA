package ClassLabAssignments;

import java.util.Scanner;
import java.util.Stack;

public class BalanceEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the equation : ");
        String str = sc.next();

        System.out.println("Is this equation balanced ? : "+balanceEquation(str));
    }
    static public boolean balanceEquation(String str){
        Stack<Character> stack= new Stack<>();
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);

            switch (c){
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }
                    break;
            }
        }

        return stack.isEmpty();
    }
}
