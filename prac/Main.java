package prac;

import java.util.*;

public class Main {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void insert(int data) {
        Node temp = new Node(data);

        if (head == null) {
            head = temp;
            return;
        }

        Node t = head;
        while (t.next != null) {
            t = t.next;
        }

        t.next = temp;
    }

    public void f(int key) {
        int c = 1;
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println(c);
                return;
            }

            temp = temp.next;
            c++;
        }

        System.out.println("Customer Not Found");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Main list = new Main();

        for (int i = 0; i < n; i++) {
            list.insert(in.nextInt());
        }

        int value = in.nextInt();

        list.f(value);
    }
}
