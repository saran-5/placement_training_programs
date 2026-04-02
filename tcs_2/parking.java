package tcs_2;

public class parking {
    public static void main(String[] args) {
        int[][]a={{1,0,1},{1,1,1},{1,0,1}};
        int index=0,max=0;
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
                if(a[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                max=count;
                index=i;
            }
        }
        System.out.println(index);
    }
}
