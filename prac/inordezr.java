package prac;
import java.util.*;

public class inordezr {
    public static void main(String[] args) {
        TreeSet<Integer> n = new TreeSet<>(Arrays.asList(5,1,3,2,4,5,6,8));
        Scanner in = new Scanner(System.in);
        
        ArrayList<Integer> l = new ArrayList<>(n);
        System.out.println(l.toString());
        for(int x : l){
            char ch = (char)('0'+x);
            System.out.println(ch);
        }
        ArrayDeque<Integer> ll = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6,7,7));
        System.out.println(ll.offerFirst(2));
        
        int d = in.nextInt();
        int[]arr = new int[d];
        for(int i=0;i<d;i++){
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int max=0;
        int t=0;
        for(int i =0;i<arr.length;i++){
            
            t+=arr[i];
        }
            System.out.print(t);
    }
}
