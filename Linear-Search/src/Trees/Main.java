package Trees;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(6);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(8);


//        root.preorder(root);
//        System.out.println();
//        root.inorder(root);
//        System.out.println();
//        root.postorder(root);
//        System.out.println();
        System.out.println(root.level(root));
//        System.out.println();
//       root.iterativePreorder(root);
//        System.out.println();
//        root.iterativePostorder(root);
//        System.out.println();
//        System.out.println(root.iterativeOrder(root));
    }
}
