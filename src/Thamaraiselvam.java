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

