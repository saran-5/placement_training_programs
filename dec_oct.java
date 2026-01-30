
    import java.util.*;
public class dec_oct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter");
        int n=in.nextInt();
        String hex=" ";
        int dec = n;
        while(dec>0){
            int rem=dec%8;
            if (rem<10) {
                hex=rem+hex;
            }
            
            dec/=8;
        }
        System.out.println(hex);

    }
}


