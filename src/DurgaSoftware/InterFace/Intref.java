package DurgaSoftware.InterFace;

/*
* Interface is Conclude Fore Any service based requirements specification
*  Any Contract blower Client A Servers provider
* 100% Pure Abstract Class is Interfaces 
* 
*
* 
*
* */


interface Intref {
  public void m1();
  public void m2();

}

abstract class ServiceProvider implements Intref {
  @Override
  public void m1() {
      System.out.printf("Service Provider m1\n");
  }

  public void m2() {
      System.out.printf("Service Provider m2\n");
  }
}

class Servicesub extends ServiceProvider implements Intref {


    @Override
    public void m1() {
//        super.m1();
        System.out.printf("Servicesub Provider m1\n");
    }
}

class Test {
    static void main() {
//        ServiceProvider s = new ServiceProvider();
//        s.m1();
//        Intref i = new ServiceProvider();
//        i.m2();

        Servicesub s = new Servicesub();
        s.m1();


    }
}