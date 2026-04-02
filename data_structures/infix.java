package data_structures;
public class infix {
    int top=-1;
    char arr[]=new char[30];
    public void push(char c){
        top=top+1;
        arr[top]=c;
    }

    public char pop() {
        char temp=arr[top];
        top=top-1;
        return temp;
    }

    public char peek(){
        return arr[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public int precedence(char c){
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
        public static void main(String[] args) {
        infix s=new infix();
        String infix="a+b*c-d";
        String postfix="";
        for(int i=0;i<infix.length();i++){
            char c=infix.charAt(i);
            if(Character.isLetterOrDigit(c)){
                postfix=postfix+c;
            }
            else if(c=='('){
                s.push(c);
            }
            else if(c==')'){
                while(!s.isEmpty()&&s.peek()!='('){
                    postfix=postfix+s.pop();
                }
                s.pop();
            }
            else{
                while(!s.isEmpty()&&s.precedence(c)<=s.precedence(s.peek())){
                    postfix=postfix+s.pop();
                }
                s.push(c);
            }
        }
        while (!s.isEmpty()) {
            postfix = postfix + s.pop();
        }
        System.out.println("Postfix expression : " + postfix);            
    }
}

