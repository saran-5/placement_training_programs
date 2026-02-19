package class_prg;

import java.util.Scanner;
class A {
    int a, b;
    public void getdata() {
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
    }
}
class Sum1 extends A {
    int c;
    public void calculateSum() {
        c = a + b;
        System.out.println("sum = " + c);
    }
    public static void main(String[] args) {
        Sum1 obj = new Sum1();
        obj.getdata();
        obj.calculateSum();
    }
}
