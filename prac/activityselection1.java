package prac;

public class activityselection1 {
    public static void main(String[] args) {
        int n=2;
        int [] st ={1,5};
        int []end = {3,4};
        int c=1;
        int last=end[0];
        for(int i =0;i<n;i++){
            if(st[i]>=last){
                c++;
                last=end[i];
            }
        }
        System.out.println("max: "+c);
    }
}
