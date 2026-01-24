package operators;
public class digit {
    public static void main(String[] args) {
        int a=5000;
        String type=(a>=1000 && a<=9999) ? "4 digit number" : "not a 4 digit number";
        System.out.println(type);
    }
}
