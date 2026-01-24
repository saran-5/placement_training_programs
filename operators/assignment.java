package operators;
public class assignment {
  public static void main(String[] args) {
    int a=10;
    System.out.println(a++ +" "+ ++a +" "+ a);
    System.out.println(++a +" "+ a +" "+ a++);
    System.out.println(a++ +" "+ a +" "+ a++);
    System.out.println(a);

    Boolean b1=true;
    Boolean b2=false;
    System.out.println(b1&b2);
    System.out.println(b1&&b2);
    System.out.println(b1|b2);
    System.out.println(b1||b2);


    int x=5;
    int y=10;
    System.out.println(x>y);
    System.out.println(x<y);
    System.out.println(x>=y);
    System.out.println(x<=y);
    System.out.println(x==y);
    System.out.println(x!=y);


    int aa=5;
    int bb=10;
    int cc= (aa>bb)?aa:bb;
    System.out.println(cc);


    int num=7;
    String result = (num%2==0) ? "Even" : "Odd";
    System.out.println(result);


    int x1=23,y1=45,z1=12;
    int largest =(x1>y1)?((x1>z1)?x1:z1):(y1>z1)?y1:z1;
    System.out.println("Largest number is: "+largest);
    

    int a1=423;
    int a11=523;
    System.out.println(a1 & a11);
    System.out.println(a1 | a11);
    System.out.println(a1 ^ a11);


    Boolean p=true;
    System.out.println(!p);


    System.out.println("A"+3+4+"B");
    System.out.println('A'+'B'+"hai");
    System.out.println('A'+"B"+'C');
    System.out.println('A'+10+'B'+"hai");
    System.out.println(true+"false"+true);
    System.out.println("example:"+(3+2)+5);
    System.out.println(2+3+"  "+"hello");

    System.out.println(+10 * 2);
    System.out.println(10 + +10 * 2);
    System.out.println(2*5/3);
    System.out.println(10*2 / 4%3);
    System.out.println(10/3);

    int m=943;
    System.out.println(m<<3);
    System.out.println(m>>5);

    int n=2593;
    System.out.println(n<<2);
    System.out.println(012+013);
  }
}
