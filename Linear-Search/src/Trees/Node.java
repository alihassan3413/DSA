package Trees;

import java.util.*;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }

    public void preorder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data+ " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void iterativePreorder(Node node){
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()){
            node = stack.pop();
//            list.add(node.data);
            System.out.print(node.data+" ");

            if(node.right != null){
                stack.push(node.right);
            }
            if(node.left != null){
                stack.push(node.left);
            }
        }
    }

    public void inorder(Node node){
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data+ " ");
        inorder(node.right);
    }

    public List<Integer> iterativeOrder(Node node){
        Stack<Node> stack = new Stack<>();
        List<Integer> list =new ArrayList<>();
        Node temp = node;
        while (true){
            if(node!=null){
                stack.push(node);
                node = node.left;
            }else {
                if(stack.isEmpty()){
                    break;
                }
                node = stack.pop();
                list.add(node.data);
                node = node.right;
            }
        }
        return list;
    }

    public void postorder(Node node){
        if(node == null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+ " ");
    }

    public void iterativePostorder(Node node){
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(node);
        while (!stack1.isEmpty()){
            Node curr = stack1.pop();
            stack2.push(curr);
            if(curr.left!=null){
                stack1.push(curr.left);
            }
            if(curr.right != null){
                stack1.push(curr.right);
            }
        }

        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().data+ " ");
        }
    }

    public List<List<Integer>> levelOrder(Node node){
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();

        if(node == null){
            return list;
        }

        queue.offer(node);

        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> sublist = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }
                sublist.add(queue.poll().data);
            }
            list.add(sublist);
        }

        return list;
    }


    public List<List<Integer>> level(Node node){
        Queue<Node> queue = new LinkedList<>();
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
