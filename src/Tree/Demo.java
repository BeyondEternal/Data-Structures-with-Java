package Tree;

import static Tree.BinaryTree.*;

public class Demo {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);

        root.left=new TreeNode(2);
        root.right=new TreeNode(3);

        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);

        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        preorder(root);
        System.out.println();

        inorder(root);
        System.out.println();

        postorder(root);
        System.out.println();
    }
}
