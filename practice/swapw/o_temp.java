package practice.swapw;
import java.util.*;
public class o_temp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a: ");
        int a=in.nextInt();
        System.out.println("enter b: ");
        int b=in.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping a: "+a);
        System.out.println("after swapping b: "+b);
    }
}
