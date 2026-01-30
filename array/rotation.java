package array;

public class rotation {
    public static void main(String[] args) {
        int[]a={1,2,3,5};
        int[]b={2,3,5,1};
        boolean fo=false;
        if(a.length==b.length){
            for(int i=0;i<a.length;i++){
                int count=0;
                for(int j=0;j<a.length;j++){
                    if(a[(i+j)%a.length]==b[j]){
                        count++;
                    }
                    else{
                        break;
                    }
                    }
                if(count==a.length){
                    fo=true;
                    break;
                }
            }
        }
        if(fo){
            System.out.println("rotated");
        }
        else{
                System.out.println("not rotated");
            }
        }
    }

