package prac;
import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class lca {

    static Node lca(Node root, int p, int q) {
        if (root == null)
            return null;

        if (root.data == p || root.data == q)
            return root;

        Node left = lca(root.left, p, q);
        Node right = lca(root.right, p, q);

        if (left != null && right != null)
            return root;

        return (left != null) ? left : right;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<Integer, Node> map = new HashMap<>();
        boolean[] child = new boolean[1000001];

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int left = sc.nextInt();
            int right = sc.nextInt();

            map.putIfAbsent(id, new Node(id));
            Node curr = map.get(id);

            if (left != -1) {
                map.putIfAbsent(left, new Node(left));
                curr.left = map.get(left);
                child[left] = true;
            }

            if (right != -1) {
                map.putIfAbsent(right, new Node(right));
                curr.right = map.get(right);
                child[right] = true;
            }
        }

        int p = sc.nextInt();
        int q = sc.nextInt();

        Node root = null;
        for (int key : map.keySet()) {
            if (!child[key]) {
                root = map.get(key);
                break;
            }
        }

        System.out.println(lca(root, p, q).data);
    }
}
