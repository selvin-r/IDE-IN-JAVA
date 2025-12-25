package Oops.StaticExample;
/*
 *  Y using In static With out Crating in Objects
 *  Static Acces Only Static Data
 *   Not Access Non Static Data
 *
 *  We Konw that Somethig witch is not static, belongs to an Objects
 *   You Cannot Use This Key Word In Static Functions
 *
 * */
public class Main {
    static void main() {
        Human h = new Human(22,"Selvin",10000,false);
        Human h1 = new Human(24,"Rahul",100000,true);

        System.out.println(h.population);
        System.out.println(h1.population);


        Main fun = new Main();
        fun.Fun2();


    }


    // This is not Dependent On objects

    static void Fun(){
     //    greeting();
        // You Cant use this Because it requires an instance but the Functiion you are using it in does not depend on instances


        // You Cannot Access non static stuff without referencing their instances is A static context
        // hence, here I am referencing it

        Main m = new Main();
        m.greeting();
    }


    void Fun2(){
        greeting();
    }
    void greeting(){
        System.out.println("this is Non static Function ");
    }
}
