package tcs_2;

public class party {
    public static void main(String[] args) {
        int[]e={7,0,5,1,3};
        int[]l={1,2,1,3,4};
        int s=0,max=0;
        for(int i=0;i<e.length;i++){
            s=s+e[i]-l[i];
            if(s>max){
                max=s;
            }
        }
        System.out.println(max);
    }
}
