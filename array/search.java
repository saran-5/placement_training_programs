package array;

public class search {
    public static void main(String[] args) {
        int[]a={1,2,3,5,6};
        int b=3;
        boolean fo=true;
        for(int i=0;i<a.length;i++){
            if(a[i]==b){
                fo=true;
                break;
            }
        }   
        if(fo){
                System.out.println("match");
            } 
        else{
                System.out.println("not match");
            }
        
    }
}
