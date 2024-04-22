package Classwork;

import java.util.LinkedList;

public class new1main {
        public static void main(String[] args) {
            new1 list = new new1();
            list.InsertAtFirst(1);
            list.InsertAtFirst(2);
            list.InsertAtFirst(3);
            list.InsertAtFirst(3);
            list.InsertAtFirst(2);
            list.InsertAtFirst(1);

            new1 l2 = new new1();
            l2.InsertAtFirst(4);
            l2.InsertAtFirst(5);
            l2.InsertAtFirst(6);

            list.merge(list.find(1), l2.find(4));
        }
}
