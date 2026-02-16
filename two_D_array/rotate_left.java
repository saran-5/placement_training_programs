package two_D_array;

public class rotate_left {
    public static void left_rotation(int[] row,int k){
    int n=row.length;
    int[] temp=new int[k];
    for(int i=0;i<k;i++){
        temp[i]=row[i];
    }
    for(int i=k;i<n;i++){
        row[i-k]=row[i];
    }
    for(int i=0;i<k;i++){
        row[n-k+i]=temp[i];
    }
}
public static void main(String[] args) {
    int[][]a={{1,2,3,4},{4,3,1,2},{5,6,7,8},{7,6,3,1}};
    for (int i=0;i<a.length;i++) {
            left_rotation(a[i], i);
        }
    for(int i=0;i<a.length;i++){
             for(int j=0;j<a[i].length;j++){
                 System.out.print(a[i][j]+" ");
             }System.out.println();
         }
}

}

