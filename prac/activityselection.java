package prac;
import java.util.*;
public class activityselection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter no.of activities: ");
        int n = in.nextInt();
        int [] start = new int[n];
        int [] end = new int[n];
        System.out.println("start&end : ");
        for(int i=0;i<n;i++){
            start[i]=in.nextInt();
            end[i]=in.nextInt();

        }
        int c=1;
        int last = end[0];
        for(int i =0; i<n;i++){
            if(start[i]>=last){
                c++;
                last=end[i];
            }
        }
        System.out.println("max: "+ c);
    }
}
