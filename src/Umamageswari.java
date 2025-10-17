public class Umamageswari {
    public static void main(String [] args){

    }
}

// revers the String

class ReversString {
     void main(String[] args) {
        String str="Welcome";
        reverse(str,0,str.length()-1);
    }
    //reverse the string
    //emocleW
    static void reverse(String s,int i,int n){
//head recursion
        String str="";
        char ch;
        if(s==null || i==(s.length()) || n<0)
            return;
        else{
            ch=s.charAt(i);
            str+=ch;
            reverse(s,i+1,n-1);
            System.out.print(" "+str);
        }
//tail recursion
        // if(n<0)
        //     return;
        // System.out.print(s.charAt(n));
        // reverse(s,n-1);
    }
}

void main() {
    System.out.println("Hello World");
}