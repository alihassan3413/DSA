package Trees;

public class Main2 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.left.left.left = new Node(5);
        root.left.left.right = new Node(6);

        root.right = new Node(7);
        root.right.right = new Node(8);
        root.right.left = new Node(9);

        System.out.println(root.level(root));
    }
}
