package two_D_array;

public class sum_border {
    public static void main(String[] args) {
        int[][]a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{1,2,3,4}};
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i==0||j==0||i==a.length-1||j==a[i].length-1){
                    sum+=a[i][j];
                }
            }
        }System.out.println(sum);
    }
}
