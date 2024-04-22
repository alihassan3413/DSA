package Classwork;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class new1 {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

        Node head;

        public void InsertAtFirst(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public Node find(int data) {
            Node current = head;
            while (current != null) {
                if (current.data == data) {
                    return current;
                }
                current = current.next;
            }
            return null;  // Return null if data is not found
        }

        public void merge(Node head1, Node head2) {
//            List<Integer> list = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            Node temp1 = head1;
            while (temp1 != null) {
                list.add(temp1.data);
                temp1 = temp1.next;
            }

            Node temp2 = head2;
            while (temp2 != null) {
                list.add(temp2.data);
                temp2 = temp2.next;
            }

            System.out.println(list);
            list.sort(Comparator.naturalOrder());
            System.out.println(list);
        }


    }
