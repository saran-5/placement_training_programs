package two_D_array;
import java.util.*;
public class hex_dec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter: ");
        String hex=in.next();
        int dec=0;
        int power=0;
        for(int i=hex.length()-1;i>=0;i--){
            char ch=hex.charAt(i);
            int val=0;
            if(ch>='0'&&ch<='9'){
                val=ch-'0';
            }
            else if(ch>='A'&& ch<='F'){
                val=ch-'A'+10;
            }
            dec+=val*Math.pow(16, power);
            power++;
        }
        System.out.println("decimal: "+dec);
    }
}
