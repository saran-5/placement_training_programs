public class good_num {
    public static void main(String[] args) {
        int n=18;
        int count=0;
        int temp=n;
            while(temp>0){
            count=count+(temp % 10);
            temp=temp/10;
        }
        if(n%count==0){
            System.out.println("good number");
        }
        else{
            System.out.println("bad number ");
        }
    }
}
