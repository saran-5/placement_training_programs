package two_D_array;

public class sum_elements {
    public static void main(String[] args) {
        int[][]a={{1,2},{3,2}};
        int sum=0;
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j];
            }
        }System.out.println("sum: "+sum);
    }
}
