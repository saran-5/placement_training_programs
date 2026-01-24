import java.util.Scanner;
public class ctof {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Celsius: ");
        float celsius = in.nextFloat();
        float fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Fahrenheit= " + fahrenheit);
    }
    
}
