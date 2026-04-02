public class mat_count {
    public static void main(String[] args) {
        int[][] a={{1,0,0,0},{0,0,0,0},{0,0,0,0},{1,1,1,0}};
        int max=0;
        int index=-1;
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]==1){
                    count++;
                }
                if(count>max){
                    max=count;
                    index=i;
                }

            }            
        }
        if(max==0){
                System.out.println("-1");
            }
            else{
                System.out.println(index);
            }
    }
}
