import java.util.*;
public class vehicle {
    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    System.out.println("enter testcase");
    int test=in.nextInt();
    while(test-->0){
        System.out.println("enter vehicle: ");
        int v=in.nextInt();
        System.out.println("enter wheel: ");
        int w=in.nextInt();
        if(w%2!=0 || w<2*v || w>4*v){
            System.out.println("-1");
        }
        else{
            int four=(w-2*v)/2;
            int two=v-four;
            System.out.println("2-wheelers: "+two+" "+"4-wheelers: "+four); 
        }
    }
        
    }
}
