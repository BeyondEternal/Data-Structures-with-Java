package Tree;

public class BinaryTree {
    static void preorder (TreeNode node){
        if(node!=null){
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }

    }
    static void inorder (TreeNode node){
        if (node!=null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
    static void postorder (TreeNode node){
        if (node!=null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }
}
