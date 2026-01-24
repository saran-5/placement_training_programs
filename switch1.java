import java.util.Scanner;
public class switch1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter numbers to perform operation");
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println("enter the operator");
        char o = in.next().charAt(0);
        switch(o){
            case '+':
                System.out.println("addition "+ (n+m));
                break;
            case '-':
                System.out.println("subtraction "+ (n-m));
                break;
            case '*':
                System.out.println(n*m);
                break;
            case '/':
                System.out.println(n/m);
                break;
            case '%':
                System.out.println(n%m);
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}
