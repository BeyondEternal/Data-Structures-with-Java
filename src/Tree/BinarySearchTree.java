package Tree;

public class BinarySearchTree {
    TreeNode root;
    TreeNode insert(int data, TreeNode root) {
        if (root==null) {
            root = new TreeNode(data);
            return root;
        }
        else if(data<= root.data) {
            root.left = insert(data, root.left);
        }
        else {
            root.right = insert(data, root.right);
        }
        return root;
    }

    TreeNode search(int data, TreeNode root){
        if (data == root.data) return root;
        else if (data < root.data) return search(data, root.left);
        else if (data > root.data) return search(data, root.right);
        else return null;
    }

    TreeNode delete(int data, TreeNode root){
        if (root == null) return root;
        else if (data < root.data) root.left = delete(data, root.left);
        else if (data > root.data) root.right = delete(data, root.right);
        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            root.data = minValue(root.right);
            root.right = delete(root.data, root.right);
        }
        return root;
    }

    int minValue(TreeNode root){
        int minVal = root.data;
        while (root.left!=null) {
            minVal = root.left.data;
            root = root.left;
        }
        return minVal;
    }
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
