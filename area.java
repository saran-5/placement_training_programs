import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = in.nextInt();
        double area = 3.14 * r * r;
        System.out.println("Area of circle= " + area);
    }
    
}
