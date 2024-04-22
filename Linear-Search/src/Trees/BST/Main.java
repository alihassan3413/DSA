package Trees.BST;

public class Main {
    public static void main(String[] args) {
        BSTNode root = new BSTNode(50);
        root.left = new BSTNode(25);
        root.left.left = new BSTNode(10);
        root.left.left.right = new BSTNode(13);
        root.left.right = new BSTNode(38);
        root.left.right.right = new BSTNode(20);
        root.left.right.left = new BSTNode(15);


        root.right = new BSTNode(70);
        root.right.right = new BSTNode(90);
        root.right.right.left = new BSTNode(77);
        root.right.right.right = new BSTNode(99);

        BSTNode node = root.deleteNode(root,38);
//        System.out.println(root.bstSearch(97,root));
        System.out.println(root.level(root));
        System.out.println(root.level(root));
    }
}
