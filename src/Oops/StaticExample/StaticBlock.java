package Oops.StaticExample;

// This is a Demo to Show initialasations Of Static varaibles
public class StaticBlock {

    static int a=4;
    static int b;


    /*
    * Will Only Run once,When tha first obj is create i.e
    *  when the class is loaded for the first time
    *
    * */

    static {
        System.out.println("Hello I am Statci Block");
        b=a*5;
    }

    static void main() {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b +=3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
