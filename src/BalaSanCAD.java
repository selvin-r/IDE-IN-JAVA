
// Polymorphism

public class BalaSanCAD {
    public static void main(String[] args) {
        A pol = new B();
        pol.print();
    }

    static class A {
        void print() {
            System.out.println("A class ");
        }
    }

    static class B extends A {
        @Override
        void print() {
            super.print();
            System.out.println("B class ");
        }
    }

    static class C extends B {
        @Override
        void print() {
            System.out.println("C class ");
        }
    }
}
