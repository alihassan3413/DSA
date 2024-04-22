package Trees.BST;

import Trees.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BSTNode {
    int data;
    BSTNode right;
    BSTNode left;

    public BSTNode(int data) {
        this.data = data;
    }

    public BSTNode(int data, BSTNode right, BSTNode left) {
        this.data = data;
        this.right = right;
        this.left = left;
    }

    public BSTNode bstSearch(int key,BSTNode node){
        if(node == null || node.data == key){
            return node;
        } else if (node.data > key) {
            return bstSearch(key,node.left);
        }else {
            return bstSearch(key,node.right);
        }
    }
    public BSTNode bstInsert(int key,BSTNode node){
        BSTNode newNode = new BSTNode(key);
        if(node == null){
            return newNode;
        } else if (node.data > key) {
            node.left =  bstInsert(key,newNode.left);
        } else {
            node.right =  bstInsert(key,newNode.right);
        }
        return node;
    }

    public BSTNode deleteNode(BSTNode root,int key){
        if(root == null){
            return null;
        }
        if(root.data == key){
            return helper(root);
        }

        BSTNode temp = root;
        while (root!=null){
            if(root.data > key){
                if(root.left != null && root.left.data == key){
                    root.left = helper(root.left);
                }else {
                    root = root.left;
                }
            }else {
                if(root.right != null && root.right.data == key){
                    root.right = helper(root.right);
                }else {
                    root = root.right;
                }
            }
        }
        return temp;
    }

    public BSTNode helper(BSTNode root){
        if(root.left == null){
            return root.right;
        }
        if(root.right == null){
            return root.left;
        }

        BSTNode rigtChild = root.right;
        BSTNode lastRight = findLastright(root.left);
        lastRight.right = rigtChild;
        return root.left;
    }

    public BSTNode findLastright(BSTNode root){
        if(root.right == null){
            return root;
        }
        return findLastright(root.right);
    }



    public List<List<Integer>> level(BSTNode node){
        Queue<BSTNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();

        queue.offer(node);

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> sublist = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                sublist.add(queue.poll().data);
            }
            list.add(sublist);
        }
        return list;
    }

}
