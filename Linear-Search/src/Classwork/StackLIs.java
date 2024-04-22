package Classwork;

import java.util.ArrayList;

public class StackLIs {
    ArrayList<Integer> list = new ArrayList<>();
    int ptr = -1;

    public void push(int val){
        list.add(++ptr,val);
    }

    public void pop(){
        System.out.println(list.remove(list.size()-1));
    }

    @Override
    public String toString() {
        return "Classwork.StackLIs{" +
                "list=" + list +
                '}';
    }

    public static void main(String[] args) {
        StackLIs li = new StackLIs();
        li.push(1);
        li.push(2);
        li.push(3);

        System.out.println(li);
        li.pop();
        li.pop();
        li.pop();
        li.pop();

        System.out.println(li);
    }
}
