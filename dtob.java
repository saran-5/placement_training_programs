import java.util.Scanner;
public class dtob {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter");
        int n=in.nextInt();
        String bin="";
        while(n>0){
            int r=n%2;
            bin=r+bin;
            n=n/2;
        }
        System.out.println("binary is "+bin);

}
}
