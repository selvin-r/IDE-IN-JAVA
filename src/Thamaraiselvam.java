import java.io.*;
//Java - Method Overload Quiz -

//void main() {
//    print(10);
//    print(10.5);
//}
//
//static void print(int s) {
//    System.out.println("Float");
//}
//
//static void print(Object s) {
//    System.out.println("Object");
//}

// Java Exception Handling===================================


class Example {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("D://Day-10.txt/");
            int a= (char)(file.read());
            String s="";
            while (a!=-1){
                s+= (char) a;
                a= file.read();
                System.out.println(s);
            }
            System.out.println("File opened successfully!" +s);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

//✅ Example 1B: Using throws keyword==================================


class FileExample2 {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader file = new FileReader("data.txt"); // compiler allows because of throws
        System.out.println("File opened successfully!");
    }
}



// quiz =====================

//class A {
//    A() {
//        System.out.println("A constructoe");
//    }
//    class B extends  A {
//        B(){
//            System.out.println("B Constructoe");
//        }
//    }
//}
//class manipoint{
//    static void main() {
//        B obj = new B();
//    }
//}


//class ExceptDemo {
//    void hello(){
//        System.out.println("1");
//        Object o = null;
//        o.toString();
//        System.out.println("3");
//    }
//
//    static void main() {
//
//        try {
//            new ExceptDemo().hello();
//
//        } catch (ArithmeticException e) {
//            System.out.println("2");
//
//        } finally (){
//            System.out.println("4");
//        }
//    }
//}

class Selvin{
    static void main(String [] args) {
        String s ="";
        try {
       s +="g";
       System.exit(0);
//       String t =args[0];
        } catch (Exception e){
            s +="o";
//             return;
        } finally {
            s +="o";
            System.out.println(s);

        }
        s +="d";
        System.out.println(s);
    }
}


class Runner{
    static void main() {
        System.out.println(s(10,12,1));

    }
    static int s(int a,int b,int c){ // Min 4;
        if(a>b)
            c=a;
        if(b>c)
            c=b;
        if(c>a)
            c=c;

        return c;
    }
}

// Quiz 1


class QU1 {
    static void main() {
        int n=10;
        for(int i=1;i<n;i=i*2){
            System.out.println("Hello");
        }
    }
}
// Answer O(logn)


// Quiz 2

