public class DP {
    public static void main(String[] args) {
       message();
    }
    static  void message(){
        System.out.println("Selvin");
        message1();
    }
    static  void message1(){
        System.out.println("Selvin1");
        message2();
    }
    static  void message2(){
        System.out.println("Selvin2");
        message3();
    }
    static  void message3(){
        System.out.println("Selvin3");
       message4();
    }
    static  void message4(){
        System.out.println("Selvin4");

    }
}
// Number explain

class Number {
    public static void main(String[] args) {

        print(1);
    }


    static  void print(int n){
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}