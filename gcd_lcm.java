import java.util.*;
public class gcd_lcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first no: ");
        int a=in.nextInt();
        System.out.print("Enter second no: ");
        int b=in.nextInt();
        int aa=a;
        int bb=b;
        while (b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("GCD: " + a);

        int c =aa*bb/a;
        System.out.println("LCM: " + c);
    }
}
