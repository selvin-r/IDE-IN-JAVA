package DurgaSoftware.AbstractModif;

/*
 * What is an abstract method?
 * An abstract method has only a declaration and no implementation.
 * An abstract method cannot have a body.
 * If u class Contain Atlist One Abstract Methods
 *
 */

public abstract class Loan {

    public abstract double getInterest();
}


/*
* What Is a Abstract class ?
*
* Important Points

Declared using abstract keyword
A class must be declared with the abstract keyword to become an abstract class.

Object creation is not allowed
You cannot create an object of an abstract class directly.

Can have abstract and non-abstract methods

Abstract method → only declaration, no body

Non-abstract method → normal method with body

Abstract methods must be implemented
Any child class extending an abstract class must implement all abstract methods, unless the child class is also abstract.

Can have constructors
Abstract classes can have constructors, which are called when a subclass object is created.

Can have variables
Abstract class can contain instance variables, static variables, and final variables.

Supports inheritance
Abstract classes are mainly used to achieve partial abstraction in Java.

Cannot be final
An abstract class cannot be final, because it must be inherited.
*
* */


abstract class Animal {
    abstract void sound();   // abstract method
      abstract void Eat();
    void sleep() {            // non-abstract method
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void Eat(){
        System.out.println("Dog Eating");
    }

    void sleep(){
        System.out.println("Dog sleeping");
    }
    static void main() {
        Dog d = new Dog();
        d.sleep();
    }

}



// Abstract Class ** Abstract Methods

/*
* Adapter Class ?
*
* Adapter Class in Java

An Adapter Class in Java is a predefined abstract class that provides empty (default) implementations for all methods of an interface.
It helps developers avoid implementing all methods of an interface when only a few are needed.
* Why Adapter Class Is Needed?

In Java, when a class implements an interface, it must override all methods of that interface.
An Adapter Class solves this problem by providing default (empty) method implementations.
*
* */
abstract class Test1{


    public void M1(){
        System.out.println("M1 is called");
    }

    public void M2(){
        System.out.println("M2 is called");
    }
    static void main() {
//        Test1 t = new Test1();

    }
}

// Methods In NO 2

abstract class Test3{

    public abstract void m4();
    public abstract void m5();
}

abstract class SubTest extends Test3{

    public void m4(){
        System.out.println("m4 is called From SubTest Class" );
    }
    public void m5(){
        System.out.println("m5 is called From SubTest Class");
    }
}
class SubSubTest extends SubTest{

    public void m4() {
        System.out.println("m4 is called SubSunTest Class");
    }

    public void m5() {
        System.out.println("m5 is called in SubSubTest Class");   // Not Reuse Functi When Call Not Error // Already Implementaion Methods is class Complier Will Thro eror
    }

    static void main() {
        SubSubTest ss = new SubSubTest();
        ss.m4();
        ss.m5();
    }
}