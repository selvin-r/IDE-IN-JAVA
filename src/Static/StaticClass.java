package Static;

public class StaticClass {


    StaticClass() {
        System.out.println("Inside Constructor");
    }


    static void main() {

        System.out.println("Inside main Mehods");
        new StaticClass();
        new StaticClass();
    }

    {
        System.out.println("Inside Non Static Block");
    }
    {
        System.out.println("Inside Non Static Block");
    }


    static {
        System.out.println("\nInside Static 1");
    }

    static void m() {
        System.out.println("\nInside m Mehod ");
    }

    static {
        System.out.println("\nInside Static 2");

    }
}
