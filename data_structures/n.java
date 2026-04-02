package data_structures;

public class n{
    char ar[]=new char[30];
    int top=-1;
    public void push(char c){
        top=top+1;
        ar[top]=c;
    }
    public char pop(){
        return ar[top--];
    }
    public char peek(){
        return ar[top];
    }
    public boolean isem(){
        return top==-1;
    }
    public int pre(char c){
        if(c=='+'||c=='-'){
            return 1;
        }
        else if(c=='*'||c=='/'){
            return 2;
        }
        else if(c=='^'){
            return 3;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        n nn= new n();
        String n="a+b*c-d";
        String p="";
        for(int i=0;i<n.length();i++){
            char c=n.charAt(i);
            if(Character.isLetterOrDigit(c)){
                p=p+c;
            }
            else if(c=='('){
                nn.push(c);
            }
            else if(c==')'){
                while(!nn.isem()&&nn.peek()!='('){
                    p=p+nn.pop();
                }
                nn.pop();
            }
            else{
                while(!nn.isem()&&nn.pre(c)<=nn.pre(nn.peek())){
                    p=p+nn.pop();
                }
            nn.push(c);
            }
        }
        while(!nn.isem()){
            p=p+nn.pop();
        }
        System.out.println("post : "+p);
    }
}
