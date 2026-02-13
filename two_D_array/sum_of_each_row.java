package two_D_array;
public class sum_of_each_row {
    public static void main(String[] args) {
        int[][]a={{1,2},{2,2}};
        int n=a.length;
        int m=a[0].length;
        for(int i=0;i<m;i++){
            int sum1=0;
            for(int j=0;j<n;j++){
                sum1+=a[j][i];            
            }System.out.println("sum: "+sum1);
        }
    }
}