import java.util.Scanner;
public class perfect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = in.nextInt();
        int sum = 0;
        for(int i =1;i<=a/2;i++) {
            if(a%i==0) {
                sum+=i;
            }
        }
        if(sum!=0&&sum==a){
            System.out.println("perfect number");
        } else{
            System.out.println("not perfect");
        }
        

    }
}