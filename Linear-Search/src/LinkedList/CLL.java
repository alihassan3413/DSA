package LinkedList;

public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head==null){
            head = tail = node;
            return;
        }
        tail.next = node;
        node.next= head;
        tail = node;

    }

    public void delete(int val){
        Node curr = head;
        Node prev = null;
        if(curr == null){
            return;
        }
        if(curr.val == val){
            head = head.next;
            tail.next = head;
        }else {
            while (curr!=null){
                if(curr.val == val){
                    prev.next = curr.next;
                    break;
                }
                prev = curr;
                curr = curr.next;
            }
        }
    }

    public void display(){
        Node node = head;

        if(head!= null){
            do {
                System.out.print(node.val +"->");
                if(node.next!=null) {
                    node = node.next;
                }
            }while (node!=head);
        }
    }
}
