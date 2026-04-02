import java.util.*;
public class palin_lib {
    public static void main(String[] args){ 
        Scanner in= new Scanner(System.in);
        System.out.println("enter : ");
        String s1 = in.nextLine();
        String reverse=new StringBuilder(s1).reverse().toString();
        if (s1.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}