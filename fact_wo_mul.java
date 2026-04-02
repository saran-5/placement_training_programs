import java.util.*; 
public class fact_wo_mul {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter: ");
        int n=in.nextInt();
        int fact=1;
        for(int i=2;i<=n;i++){
            int sum=0;
            for(int j=1;j<=i;j++){
                sum=sum+fact;
                
            }
            fact=sum;
            System.out.println(sum);
        }
        System.out.println(fact);
    }
}
