package prac;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data= data;
        this.left=null;
        this.right=null;

    }
}
public class tree {

    static void inorder(TreeNode root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + "  ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        inorder(root);   // passing the root node
    }
}