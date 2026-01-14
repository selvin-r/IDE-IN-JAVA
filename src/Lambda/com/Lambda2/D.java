package Lambda.com.Lambda2;



/*
*
*
* Multiple non-overriding abstract methods found in D
* */

@FunctionalInterface
public interface D {

    void run();

}


//class E extends Object implements D {
//    @Override
//    public void run() {
//        System.out.println("E");
//    }
//}


// Replacement This Code

class Main{
    static void main() {
        D obj = () ->
        {
            System.out.println("Hello Iam Run...");
        };
        obj.run();
    }
}