package prac;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class BSTsearch {

    static Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }

    static boolean search(Node root, int x) {
        if (root == null)
            return false;

        if (root.data == x)
            return true;

        if (x < root.data)
            return search(root.left, x);

        return search(root.right, x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node root = null;

        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        int x = sc.nextInt();

        System.out.println(search(root, x) ? "FOUND" : "NOT FOUND");
    }
}
