package two_D_array;
import java.util.Scanner;
public class add_long_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter A: ");
        String a=in.next();
        System.out.println("enter B: ");
        String b=in.next();
        String result="";
        int carry=0;
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0||j>=0||carry>0){
            int sum=carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }
            carry=sum/10;
            result=(sum%10)+result;
        }
        System.out.println("sum: "+result);
    }
}
