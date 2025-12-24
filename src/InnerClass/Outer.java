package InnerClass;


/*
 * Inner class
 *    -Non Static member inner class
 *   - Static Member Inner class
 *   -Anonymous Inner Class
 *    -Local Inner Class
 *
 * */


public class Outer {
    static void main() {
        Outer o = new Outer();
//        o.M1();
//        o.M2();
//        M2();
//        Outer.M2();

        // That Is Static Way
        Outer.Inner i = new Outer.Inner();
        i.M1();
        i.M2();
        Outer.Inner.M2();

//       Outer.Inner in = o.new Inner();   // New Way
//       in.M1();
//        in.M2();
//        Outer.Inner.M2();  // This Way Can Do


    }

    void M() {
        class LocalInner {
            void M1() {
                System.out.println("Non Static Local Inner Class Method ");
            }

            static void M2() {
                System.out.println("Static Local Inner Class Method ");
            }
        }
        LocalInner l = new LocalInner();
        l.M1();
        l.M2();
        LocalInner.M2();
    }


    void M1() {
        System.out.println("Non Static Oter Class Method ");
    }

    static void M2() {
        System.out.println("Static Oter Class Method ");
    }

    static class Inner {

        void M1() {
            System.out.println("Non Static Inner Class Method ");
        }

        static void M2() {
            System.out.println("Static Inner Class Method ");
        }

    }
}
