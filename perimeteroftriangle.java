import java.util.Scanner;
public class perimeteroftriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a & b & c: ");
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        float perimeter = a+b+c;
        System.out.println("Perimeter of rectangle= " + perimeter);
    }
}