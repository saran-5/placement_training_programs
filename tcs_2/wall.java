package tcs_2;
import java.util.*;
public class wall {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int interior = sc.nextInt();
        int exterior = sc.nextInt();
        double in= 0;
        double ex= 0;
        for(int i=0;i<interior;i++){
            in+= sc.nextDouble();
        }
        for(int i=0;i<exterior;i++){
            ex+= sc.nextDouble();
        }
        double cost=(in*18)+(ex*12);
        System.out.println("Total estimated Cost : " + cost + " INR");
    }
}

