package two_D_array;

public class row_with_max {
     public static void main(String[] args) {
        int[][]a={{1,2},{3,2}};
        int n=a.length;
        int m=a[0].length;
        
        int max=0;    
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=a[i][j];        
            }
            if(sum>max){
                    max=sum;
                }   
        }System.out.println("max "+max);
    }
}
