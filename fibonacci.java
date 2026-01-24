import java.util.Scanner;
class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter ");
        int n =in.nextInt();
        int a=0,b=1;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
