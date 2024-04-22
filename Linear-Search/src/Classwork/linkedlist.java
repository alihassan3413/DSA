package Classwork;

import LinkedList.DLL;
import LinkedList.LL;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class linkedlist {

    private Node head;
    private int size;
    public class Node {
        int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
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

    public void delete(int val){
        Node temp = head;
        Node prev = null;
        while (temp !=null){
            if(temp.data == val){
                prev.next = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    public void InsertAtFirst(int data){
        Node newestNode = new Node(data);
        if(head == null){
            head = newestNode;
        }else {
            newestNode.next = head;
            head = newestNode;
        }
        size++;
    }

    public void DeleteAtFirst(){

        if(head!=null){
            head = head.next;
        }else {
            System.out.println("List is empty!! Nothing to Delete.");
        }
    }
    public void InsertToLast(int data){
        Node newestNode = new Node(data);
        newestNode.next = null;
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newestNode;
        size++;
    }

    public void deletefromLast(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;

        Node prev = null;
        while (temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
    }


    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
//        System.out.println();
//        System.out.println(size);
        System.out.println("END!!!");
    }

    public void insertintoMiddle(int loc,int data){
        Node newwestNode = new Node(data);
        if(this.head == null){
            this.head = newwestNode;
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
        size++;
    }


    public void insertintoMiddleSort(int data){
        Node newwestNode = new Node(data);
        if(this.head == null){
            this.head = newwestNode;
        } else {
            Node curr=this.head;
            Node prev = null;

            while (curr != null){

                if(curr.data >= newwestNode.data){
                    if(prev != null) {
                        prev.next = newwestNode;
                        newwestNode.next = curr;
                        break;
                    }else {
                        // we are not using prev here becz prev is equal to null we can use curr or head
                        newwestNode.next = head;
                        head = newwestNode;
                        break;
                    }
                }
                prev = curr;
                curr = curr.next;
            }


        }
        size++;
    }

    public void deleteAnyLoc(int loc){
        if(head == null){
            System.out.println("List is empty!!!");
        }else if (loc == 1){
            head = head.next;
        }else {
            Node curr = head;
            Node prev = null;
            int counter = 0;

            while (curr != null){
                counter++;

                if(counter == loc){
                    if(prev!=null) {
                        prev.next = curr.next;
                    }
                    break;
                }

                prev = curr;
                curr = curr.next;
            }
        }
    }

    public void removeNode(Node targetNode) {
        if (head == null) {
            System.out.println("List is empty! Nothing to remove.");
            return;
        }

        if (head == targetNode) {
            head = head.next;
            size--;
            return;
        }

        Node temp = head;
        Node prev = null;

        while (temp != null && temp != targetNode) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Node not found in the list.");
            return;
        }

        // Remove the targetNode
        prev.next = temp.next;
        size--;
    }

    public void insertat(int val,int index){
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
    }

    public Node addNumbers(Node h1 , Node h2){
        Node t1 = h1;
        Node t2 = h2;

        Node dummyNode = new Node(-1);
        int carry = 0;
        Node curr = dummyNode;

        while (t1 != null || t2 != null){
            int sum = carry;

            if(t1 != null) sum += t1.data;
            if(t2 != null) sum += t2.data;

            Node newNode = new Node(sum %10);
            carry = sum / 10;

            curr.next = newNode;
            curr = curr.next;

            if(t1 != null) t1 = t1.next;
            if(t2 != null) t2 = t2.next;
        }
        if(carry > 0){
            Node newNode = new Node(carry);
            curr.next = newNode;
        }

        System.out.println(dummyNode.next.data);
        return dummyNode.next;
    }


    public Node addNumbers2(Node h1, Node h2) {
        Node t1 = h1;
        Node t2 = h2;

        Node dummyNode = new Node(-1);
        int carry = 0;
        Node curr = dummyNode;

        while (t1 != null || t2 != null) {
            int sum = carry;

            if (t1 != null) {
                sum += t1.data;
                t1 = t1.next;
            }
            if (t2 != null) {
                sum += t2.data;
                t2 = t2.next;
            }

            curr.next = new Node(sum % 10);
            curr = curr.next;
            carry = sum / 10;
        }

        if (carry > 0) {
            curr.next = new Node(carry);
        }


        System.out.println(dummyNode.next.data);
        return dummyNode.next;
    }


    public Node oddEven(){
        List<Integer> list = new ArrayList<>();
        Node temp = head;

        while (temp != null && temp.next != null){
            list.add(temp.data);
            temp = temp.next.next;
        }
        if(temp!=null) list.add(temp.data);

        Node temp2 = head.next;
        while (temp2!= null && temp2.next != null){
            list.add(temp2.data);
            temp2 = temp2.next.next;
        }
        if(temp2 != null) list.add(temp2.data);

        System.out.println(list);

        return temp;
    }

    public boolean isPalindrome(){
        Stack<Integer> stack = new Stack<>();
        Node temp = head;

        while (temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }

        Node temp2 = head;

        while (temp2 != null){
            if(temp2.data != stack.peek()) return false;
            stack.pop();
            temp2 = temp2.next;
        }
        return true;
    }

    public void merge(Node head1 , Node head2){
        List<Integer> list = new ArrayList<>();
        Node temp1 = head1;
        while (temp1 != null){
            list.add(temp1.data);
            temp1 = temp1.next;
        }

        Node temp2 = head2;
        while (temp2 != null){
            list.add(temp2.data);
            temp2 = temp2.next;
        }

        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }


    public Node merge2(Node head1, Node head2) {
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

        list.sort(Comparator.naturalOrder());
        Node head = mergeListToLinkedList(list);
        System.out.println(list);
        return head;
    }

    public Node mergeListToLinkedList(List<Integer> list) {
        Node head = null;
        Node current = null;

        for (int num : list) {
            Node newNode = new Node(num);
            if (head == null) {
                head = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = current.next;
            }
        }

        return head;
    }

    // brute force solution for finding the middle node of the linked list

    public Node findMiddle(){
        Node temp = head;
        int count =0;
        while (temp != null){
            count++;
            temp = temp.next;
        }

        int mid = (count/2)+1;

        int count2 = 0;
        Node temp2 = head;
        while (temp2 != null){
            count2++;
            if(count2 == mid){
                return temp2;
            }else {
                temp2 = temp2.next;
            }
        }

        return null;
    }


    // find middle using tortoise and hare algorithm

    public Node findMidTortoise(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // reverse the linked list
    public void reversed(){
        Node temp = head;
        Stack<Integer> st = new Stack<>();
        while (temp != null){
            st.push(temp.data);
            temp = temp.next;
        }

        Node curr = head;
        while (curr != null){
            curr.data = st.pop();
            curr = curr.next;
        }
    }

}
