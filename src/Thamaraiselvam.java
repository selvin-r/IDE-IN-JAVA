
//Java - Method Overload Quiz -

public class Thamaraiselvam {
    public static void main(String [] args){
        print(10);
        print(10.5);
    }
    static void print(float s){
        System.out.println("Float");
    }
    static  void print(Object s){
        System.out.println("Object");
    }
}
