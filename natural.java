import java.util.Scanner;
public class natural {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n=in.nextInt();
        int sum=n*(n+1)/2;
        System.out.println("Sum of first " + n + "natural no: "+sum);
    }
}
