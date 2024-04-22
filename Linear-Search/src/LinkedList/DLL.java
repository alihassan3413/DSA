package LinkedList;

public class DLL {

    Node head;
    Node tail;


    public void inserAtFirst(int val){
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

    public void insertAtLast(int val){
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

    public void  insert(int loc,int val){
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
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void removeNode(Node target){
        if(target == head){
            head = head.next;
            if(head!=null){
                head.prev = null;
            }else {
                tail = null;
            }
            return;
        }

        if(tail == target){
            tail = tail.prev;
            tail.next = null;
            return;
        }

        Node temp = head;
        while (temp != null && temp != target){
            temp = temp.next;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    public void delete1(int val){
        Node temp = head;
        Node prev = null;

        while (temp != null){
            if(temp.val == val){
                prev.next = temp.next;
                if(temp.next != null) {
                    temp.next.prev = prev;
                }
            }
            prev = temp;
            temp = temp.next;
        }
    }

    public void insertAfter(int after,int val){
        Node node = new Node(val);
        Node prev = find(after);

        if(prev == null){
            System.out.println("This does not exist.");
            return;
        }
        node.next = prev.next;
        prev.next = node;
        node.prev = prev;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    public void display(){
        Node node = head;
        tail = null;
        while (node != null){
            System.out.print(node.val + "->");
            tail = node;
            node = node.next;
        }
        System.out.println();

        System.out.println("Reverse");
        while (tail!=null){
            System.out.print(tail.val + "->");
            tail = tail.prev;
        }
        System.out.println("Start");
    }

    private class Node{
        int val;
        Node next;
        Node prev;


        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }


}
