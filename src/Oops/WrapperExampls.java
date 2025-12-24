package Oops;

public class WrapperExampls {
    static void main() {

        int a=10;
        Integer num=45;

        Integer num1=30;
        Integer num2=55;

        swap(num1,num2);
        System.out.println(num1 + " " + num2);

     final A obj = new A("Selvin");
     obj.name ="Other Name";
        System.out.println(obj.name);
     // When a Non Primitive Is final You Cannot Reassign it
        // obj=new A("New Objects");


        A obj1 = new A("Selvinooo");
        System.out.println(obj1);

//        for (int i=0;i<10;i++) {
//            obj1 = new A("Random name ");
//        }




    }
    /*
    * Final Varaible Can Not be Modifive
    * Always inisiala while Decleaing
    * */

    static void swap(Integer num1,Integer num2) {

        Integer temp=num1;
        num1=num2;
        num2=temp;
    }
}
class A {
    final int num=10;
    String name;


  public A(String name) {
      this.name=name;
  }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize Objects is Distoryed");
    }
}

