import java.util.*;
public class dec_hex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter");
        int n=in.nextInt();
        String hex=" ";
        int dec = n;
        while(dec>0){
            int rem=dec%16;
            if (rem<10) {
                hex=rem+hex;
            }
            else if(rem>=10){
                hex=(char)((rem-10)+'A')+ hex;
                
            }
            dec/=16;
        }
        System.out.println(hex);

    }
}
