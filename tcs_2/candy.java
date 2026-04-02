package tcs_2;
import java.util.*;
public class candy {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int c=10;
        int k=5;
        int candy=c;
        System.out.println("enter number of candies need: ");
        int o=in.nextInt();
        if(o>c){
            System.out.println("not avail");
        }
        else{
            candy-=o;
            System.out.println("no.of sold: "+c);
            System.out.println("no.of left"+candy);
        }
        if(candy<=k){
            candy=c;
        }

    }
}
