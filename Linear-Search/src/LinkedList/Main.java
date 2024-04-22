package LinkedList;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();

        list.inserAtFirst(1);
        list.inserAtFirst(2);
        list.inserAtFirst(3);
        list.inserAtFirst(4);
        list.inserAtFirst(5);
//
//        list.insert(1,10);
//        list.insert(5,20);
//        list.insert(3,2);
//        list.insert(4,3);

//        list.insertAtLast(1);
//        list.insertAtLast(2);

//        list.insertAfter(1,6);

//        list.deleteLast();
//        list.delete(3);

        list.removeNode(list.find(3));
        list.delete1(1);

        list.display();


//        CLL list = new CLL();
//        list.insert(18);
//        list.insert(23);
//        list.insert(56);
//        list.insert(10);
//
//        list.delete(23);
//
//        list.display();
    }

}
