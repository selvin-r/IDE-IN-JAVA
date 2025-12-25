package Oops.StaticExample;



public class Human {

    int age;
    String name;
    int salary;
    boolean married;
   static long population;

  static void Message(){
      System.out.println("Hello I am Static Functions ");

//      System.out.println(this.age);   // Cant Use This Over Here :)
  }
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population +=1;
//        Human.Message();

    }
}
