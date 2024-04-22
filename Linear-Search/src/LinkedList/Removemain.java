package LinkedList;

public class Removemain {
        public static void main(String[] args) {
            ListNode list = new ListNode(0); // Starting with a dummy head
            list.add(1);
            list.add(2);
            list.add(1);
            list.add(4);
            list.add(2);

            System.out.println("Original list:");
            list.display();

            list.removeDuplicates();

            System.out.println("List after removing duplicates:");
            list.display();
        }
    }
