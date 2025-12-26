package Oops.StaticExample;
/*
 * OutSide Class is Canot Static
 * Only inner Class is Only Static
 *
 *  use static key Word then No depending in Objects
 *
 * */


public class InnerClass {


    static class InnerTest {
        String name;

        public InnerTest(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }



    static void main() {
        InnerTest t1 = new InnerTest("selvin");
        InnerTest t2 = new InnerTest("David");
        System.out.println(t1);

    }
}

