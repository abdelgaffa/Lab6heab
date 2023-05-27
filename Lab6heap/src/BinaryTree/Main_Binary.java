package BinaryTree;

import java.util.function.Function;

public class Main_Binary {
    public static void main(String[] args) {

        TreeNode a = new TreeNode("A");
        TreeNode b = new TreeNode("BB");
        TreeNode c = new TreeNode("CCC");
        TreeNode d = new TreeNode("DDDD");
        TreeNode rootF = new TreeNode("F");

        TreeNode g = new TreeNode("G");
        TreeNode e = new TreeNode("EE");
        TreeNode h= new TreeNode("HHH");
        TreeNode i = new TreeNode("IIII");

        d.setLeftChild(c);
        d.setRightChild(e);

        b.setLeftChild(a);
        b.setRightChild(d);

        i.setLeftChild(h);

        g.setRightChild(i);

        rootF.setLeftChild(b);
        rootF.setRightChild(g);
        rootF.preorder(rootF,System.out::println);

        rootF.preorder(rootF,node ->{
            for (int j = 0; j <10 ; j++) {
                System.out.println(node.getData());

            }
        });
        System.out.println("-----------------");
        System.out.println(rootF.preorderFun(rootF,node -> node.getData().length()));

    }
}
