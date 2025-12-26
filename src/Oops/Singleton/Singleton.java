package Oops.Singleton;

public class Singleton {

    private Singleton(){

    }


    private static  Singleton instance;


    public  static  Singleton getInstance(){

        // Check Whether 1 Obj only is Created or Not


        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
