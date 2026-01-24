import java.util.Scanner;
public class ftoc {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        float fahrenheit = in.nextFloat();
        float celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Celsius= " + celsius);
    }
}