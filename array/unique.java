package array;

public class unique {
    public static void main(String[] args) {
        int[]a={1,1,2,3,4};
        int uniq=0;
        for(int i=0;i<a.length;i++){
            // if(i>0&&a[i]==a[i-1]){
            //     continue;
            // }
            // if(i<a.length-1&&a[i]==a[i+1]){
            //     continue;
            // }
            // System.out.println(a[i]);
            // }
            int count=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count==1){
                uniq++;
                System.out.println(a[i]);
            
        }}System.out.println();
        System.out.println(uniq);
    }}

