package DurgaSoftware.AbstractModif;

abstract  class Vehicle {
    public abstract int getNoOfWheels();

}

class Bus extends Vehicle {


    /**
     * @return
     */
    @Override
    public int getNoOfWheels() {
        return 6;
    }
}

class Auto extends Vehicle {

    /**
     * @return
     */
    @Override
    public int getNoOfWheels(){


        return 3;
    }
}

class Engine {
    static void main() {

        Bus b = new Bus();
//        System.out.println(  b.getNoOfWheels());
        System.out.printf("getNoOfWheels In Bus: %d\n", b.getNoOfWheels());


        Auto a = new Auto();
        System.out.printf("getNoOfWheels In Auto: %d\n", a.getNoOfWheels());
    }
}