public class JavaInterviewQ {
    static void main() {

    }
}


// Qustion No1

class Q1 {

    public static class Test {
        private int x, y;

    }

    public static void main(String[] a) {
        Test t = new Test();
        System.out.printf(t.x + " " + t.y);
    }
}


// Qustion No 2


class Q2 {
    static void main() {

        for (int i = 1; true; i++) {     // 1 inset Error   // Boolean Value Is Work
            System.out.printf("Hello");
            break;
        }
    }
}


// Qustion No 3

// java: non-static method fun() cannot be referenced from a static context
// How to Fix Methods Must Be static

class Q3 {
    static void main() {

        System.out.println(fun());
    }

    static int fun() {

        return 20;
    }
}


// Qustion No 4

//java: illegal start of expression
//java: statements not expected outside of methods and initializers
//java: class, interface, annotation type, enum, record, method or field expected

// How to fix the static key word Must use class and instances varaibale
class Q4 {
    static int x = 0;   // This is change error is fix


    static void main() {

        System.out.println(fun());

    }

    static int fun() {


        return ++x;
    }
}

// Qustion No 5
// java: illegal digit in an octal literal
// Runtime Error so Tha Number is Must 0 to 8 so tha mean 8 is actal Number

class Q5 {
    public static void main(String[] args) {

        int y = 03563;
        System.out.println(y);  // 1907
    }
}


// Qustion No 6

class Q6 {
    static void main() {

        String s1 = "abc";
        String s2 = s1;
        s1 += "d";
        System.out.println(s1 + " " + s2 + " " + (s1 == s2));

        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = sb1;
        sb1.append("d");
        System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2));
    }
}

// Qustion No 7
// First propiratiy value is first call so print in String
class Q7 {
    static void main() {
        gfg(null);
    }

    static void gfg(String s) {
        System.out.println("String");   // String
    }

    static void gfg(Object o) {
        System.out.println("Object");
    }
}


// Qustion No 8

// java: constructor Complex in class Q8.Complex cannot be applied to given types;
//  required: Q8.Complex
//  found:    no arguments
//  reason: actual and formal argument lists differ in length

// how to fix java la Defult Constructo Wokr Agala y Copy contructo Creat so not work so Error How to fix defalut creasting

class Q8 {
    static void main() {
        Complex c1 = new Complex();
        Complex c2 = new Complex(c1);
        System.out.println(c2);
    }

    static class Complex {
        private double re, im;


        public String toString() {


            return "(" + re + " + " + im + "i)";
        }

        Complex() {
            // this is Default So is u Manaual Crat so work
        }

        Complex(Complex c) {
            re = c.re;
            im = c.im;
        }
    }
}

// Qustion No 9

// java: break outside switch or loop  (Error)

class Q9 {
    static void main() {

        if (true) ;
//            break;      ( Error )
    }
}

// Qustion No 10

//This Not Output y Tha value is Char so asci value is concnet tha sum last Answer
// tha code is java is print u change only one value " " change total value change is string
class Q10 {
    static void main() {


        System.out.println('j' + 'a' + 'v' + 'a');  // 418
    }
}

// Qustion No11
//This Code is Only varaible Dicleraing so tha value is Nothink so not Print Any think
// Tha this statemet is legals
class Q11 {

    static void main() {


        int $_ = 5;
//        System.out.println($_);   // 5
    }
}

// Qustion No 12

//That integer is onec craeat tha same Number value to painth that Number also point -128 -127 Caching
//  tha sum .equals() function inset so value is diferance
class Q12 {
    static void main() {

        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = 500;
        Integer num4 = 500;


        if (num1 == num2) {
            System.out.println("num1==num2");
        } else {
            System.out.println("num1!=num2");
        }
        if (num3 == num4) {
            System.out.println("num3==num4");
        } else {
            System.out.println("num3!=num4");
        }
    }
    /* num1==num2
num3!=num4 */
}


// Qustion No13
// That is call Methods Overloading

class Q13 {
  public static void main(String[] args) {

  }
  public   static void main(String  args) {

  }

  // Output is  Nothing
}



// Youtube JustWriteCode chennal


class Q14 {
    static void main() {

    }
}





























