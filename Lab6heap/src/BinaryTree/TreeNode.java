package BinaryTree;

import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Function;

public class TreeNode {

     private String data;
    private TreeNode leftChild;
    private TreeNode rightChild;



    public TreeNode(String data) {
        this.data = data;
        leftChild = null;
        rightChild = null;
    }


    public void preorder(TreeNode node, Consumer<TreeNode> p){
        if (node == null)return;
        p.accept(node);

        preorder(node.leftChild,p);
        preorder(node.rightChild,p);
    }
    public Integer preorderFun(TreeNode node, Function<TreeNode,Integer > p){
        if (node == null) return 0;

        Integer res= p.apply(node);

       Integer leftRes=preorderFun(node.leftChild,p);
       Integer rightRes=preorderFun(node.rightChild,p);

        return res+leftRes+rightRes;
    }

    public void preorder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.getData());
        preorder(node.leftChild);
        preorder(node.rightChild);

    }

    public void iterativePreorder(TreeNode node) {
        if (node == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            TreeNode Node = stack.pop();
            System.out.println(Node.getData());

            if (Node.getRightChild() != null) {
                stack.push(Node.getRightChild());
            }
            if (Node.getLeftChild() != null) {
                stack.push(Node.getLeftChild());
            }
        }
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return
                "data='" + data;
    }
}
