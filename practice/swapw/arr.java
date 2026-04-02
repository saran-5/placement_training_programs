package practice.swapw;
import java.util.*;
public class arr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a: ");
        String a=in.nextLine();
        System.out.println("enter b: ");
        String b=in.nextLine();
        while (a.length()!=b.length()) {
            if(a.length()<b.length()){
                a="0"+a;
            }
            else{
                b="0"+b;
            }            
        }
        String res="";
        int carry=0;
        for(int i=a.length()-1;i>=0;i--){
            int b1=a.charAt(i)-'0';
            int b2=b.charAt(i)-'0';
            int sum=b1+b2+carry;
            res=(sum%2)+res;
            carry=sum/2;
        }
        if(carry==1){
            res="1"+res;
        }
        System.out.println("res: "+res);
    }
}
