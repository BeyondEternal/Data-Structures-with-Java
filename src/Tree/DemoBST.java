package Tree;

public class DemoBST {
    public static void main(String[] args) {
        BinarySearchTree ob=new BinarySearchTree();
        ob.root=ob.insert(50,ob.root);
        ob.root=ob.insert(30,ob.root);
        ob.root=ob.insert(20,ob.root);
        ob.root=ob.insert(20,ob.root);
        ob.root=ob.insert(70,ob.root);
        ob.root=ob.insert(60,ob.root);
        ob.root=ob.insert(80,ob.root);
        ob.root=ob.delete(50, ob.root);
        System.out.println("******" +ob.root.data);
        ob.inorder(ob.root);

        TreeNode find=ob.search(30,ob.root);
        if(find==null)
            System.out.println("not found");
        else
            System.out.println("found : "+find.data);
    }
}
