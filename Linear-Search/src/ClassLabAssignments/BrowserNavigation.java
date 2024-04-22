package ClassLabAssignments;

import LinkedList.DLL;

public class BrowserNavigation {
    Node head;
    Node tail;


    public void inserAtFirst(String val){
        Node node = new Node(val);
        node.prev = null;
        node.next = head;
        if(head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty.");
        }
        if(head.next != null) {
            head = head.next;
            head.prev = null;
        }else {
            head = null;
        }
    }

    public void insertAtLast(String val){
        Node node = new Node(val);
        Node temp = head;

        if(head == null){
            node.prev = null;
            head = node;
        }else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            node.next = null;
            node.prev = temp;
        }
    }

    public void deleteLast(){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        if(temp == head){
            head = null;
            return;
        }
        temp.prev.next = null;
    }


    public void  insert(int loc,String val){
        if(loc == 1){
            inserAtFirst(val);
        } else {
            Node node =new Node(val);

            Node current = head;
            Node previous = null;

            for (int i = 1; i < loc ; i++) {
                previous = current;
                current = current.next;
            }

            if(current == null){
                insertAtLast(val);
            }else {
                node.next = current;
                node.prev = previous;
                current.prev = node;
                previous.next = node;
            }
        }
    }

    public void delete(int loc){
        if(loc==1){
            deleteFirst();
        }else {
            int counter= 0;
            Node curr =head;
            Node prev = null;

            while (curr!=null){
                counter++;
                if(counter==loc){
                    prev.next = curr.next;
                    if(curr.next != null) {
                        curr.next.prev = prev;
                    }
                }
                prev = curr;
                curr = curr.next;
            }
        }
    }


    public Node find(int value){
        Node node = head;
        while (node !=null){
            if(node.data == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void visit(String url){
        Node node = new Node(url);
        if(head == null){
            head=node;
            tail=node;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public void goForward() throws Exception{
        if(tail.next == null){
            throw new Exception("No Url found");
        }
        tail = tail.next;
    }

//    public void goBack() throws Exception{
//        if(tail.prev == null){
//            throw new Exception("No Url found");
//        }
//        tail = tail.prev;
//    }

    public void goBack() throws Exception{
        if(tail.prev == null){
            throw new Exception("No Url found");
        } else {
            System.out.println("Moving back from: " + tail.url + " to " + tail.prev.url);
        }
        tail = tail.prev;
    }

    public void display(){
        Node node = head;
        while (node != tail.next){
            System.out.print(node.url + "->");
            node = node.next;
        }
        System.out.println();

    }

    public void displayReverse() {
        Node node = tail;

        while (node != null) {
            System.out.print(node.url + "->");
            node = node.prev;
        }
        System.out.println();
    }

    public class Node{
        String url;
        Node next;
        Node prev;
        int data;

        public Node(String url) {
            this.url = url;
        }

        public Node(int data) {
            this.data = data;
        }

        public Node(String url, Node next, Node prev) {
            this.url = url;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) throws Exception {
        BrowserNavigation b1 = new BrowserNavigation();
        b1.visit("www.google.com");
        b1.visit("www.alihassan.com");
        b1.visit("www.hassan.com");
        b1.display();

        b1.goBack();
        b1.goBack();
        b1.display();

        System.out.println("After Moving Forward");
        b1.goForward();
        b1.goForward();
        b1.visit("gsoc.com");
        b1.display();

    }
}
