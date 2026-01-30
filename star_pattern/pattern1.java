package star_pattern;
import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter : ");
        int n=in.nextInt();
        
        int sum=0;
        for(int i=1;i<=n;i++){
            int num =0;
            for(int j=1;j<=i;j++){
                num = num * 10;
                num = num + 9;
            }
            sum+=num;
            System.out.println(sum + " ");//
            
        }
        System.out.println(sum);
    }
    
}
