package LinkedList;

import Classwork.linkedlist;

public class LL {

    private Node head;
    private Node tail = null;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insert1(int val){
        Node node = new Node(val);
        node.next = head;

        head = node;

        if(tail==null){
            tail=head;
        }

        size++;
    }

    public void insertAtLast(int val){
        Node node = new Node(val);
        node.next = tail;
        tail = node;
        size++;
    }


    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }

        System.out.println("END!!!");
    }



    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }


    public void insert(int loc,int data){
        Node newwestNode = new Node(data);
        if(this.head == null){
            this.head = newwestNode.next;
        } else if (loc == 1) {
            newwestNode.next = this.head;
            this.head = newwestNode;
        }else {
            Node curr=this.head;
            Node prev = null;
            int counter = 0;

            while (curr != null){
                counter++;
                if(counter == loc){
                    prev.next = newwestNode;
                    newwestNode.next = curr;
                    break;
                }
                prev = curr;
                curr = curr.next;
            }

            if (curr == null && counter < loc) {
                prev.next = newwestNode;
            }
        }
    }}
