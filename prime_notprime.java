import java.util.Scanner;
class prime_notprime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number ");
        int n =in.nextInt();
        boolean isPrime = true;
        if(n<=1){
            isPrime = false;
        }else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(n+" is prime");
        }else{
            System.out.println(n+" is not prime");
        
    }
}
}
