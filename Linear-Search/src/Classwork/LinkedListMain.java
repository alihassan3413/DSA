package Classwork;

public class LinkedListMain {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.InsertAtFirst(1);
        list.InsertAtFirst(2);
        list.InsertAtFirst(3);
        list.InsertAtFirst(4);
        list.InsertAtFirst(2);
        list.InsertAtFirst(1);

        linkedlist l2 = new linkedlist();
        l2.InsertAtFirst(4);
        l2.InsertAtFirst(5);
        l2.InsertAtFirst(7);
        l2.InsertAtFirst(6);

//        linkedlist.Node n1 = list.merge2(list.find(1),l2.find(6));
//        System.out.println(n1.data);

//        int num =  l2.findMidTortoise().data;
//        System.out.println(num);
        l2.display();
        l2.reversed();
        l2.display();
//        System.out.println(list.addNumbers(list.find(3),l2.find(6)));
//        System.out.println(list.oddEven());
//        System.out.println(list.isPalindrome());
//        list.insertintoMiddle(1,2);
//        list.insertintoMiddle(2,4);
//        list.insertintoMiddleSort(3);
//        list.insertintoMiddleSort(1);
//        linkedlist.Node t1 = list.find(2);
////        list.DeleteAtFirst();.
//
////        list.deletefromLast();
////        list.deletefromLast();
//        list.delete(2);
//        list.removeNode(list.find(3));
//        list.display();
////        list.removeNode(t1);
//////        list.deleteAnyLoc(2);
////        list.display();
    }
}
