package tcs_2;
public class ballooon {
    public static void main(String[] args) {
        char[]a={'r','g','b','b','g','y','y'};
        boolean fo=false;
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count%2!=0){
                System.out.println(a[i]);
                fo=true;
                break;
            }
        }
        if(!fo){
            System.out.println("all even");
        }
    }
}
