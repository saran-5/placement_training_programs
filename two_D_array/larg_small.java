package two_D_array;

public class larg_small {
    public static void main(String[] args) {
        int[][]a={{1,2,3},{2,4,5}};
        int large=a[0][0];
        int small=a[0][0];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]>large){
                    large=a[i][j];
                }
                }
            }System.out.println(large+" is greater ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]<small){
                    small=a[i][j];
                }
                }
            }System.out.println(small+" is smaller ");
        }
        
    }

