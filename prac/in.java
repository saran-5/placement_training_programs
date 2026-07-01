package prac;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class in {
    static void m(Node root){
    if(root==null){
        return;
    }
    m(root.left);
    System.out.println(root.data);
    m(root.right);
    }
    static void post(Node root){
        if(root == null){
            return;
        }
        post(root.left);
        post(root.right);
        System.out.println(root.data);
    }
    static void pre(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        pre(root.left);
        pre(root.right);
    }
    public static void main(String [] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right= new Node(3);
        m(root);
        System.out.println("inorder");
        post(root);
        System.out.println("post");
        post(root);
        System.out.println("pre");
    }
}
