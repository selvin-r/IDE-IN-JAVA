class Mileage {

    double distance;
    Mileage(double distance){
        this.distance=distance;
    }


    public void Calculate(){

    }

}

class Scooter extends Mileage{
    double fuel;
    Scooter(double distance,double fuel){
       super(distance);
       this.fuel=fuel;
    }
    public void Calculate(){
        System.out.printf("Scooter "+"\nMileage: %.2f km/litre\n\n", distance/fuel);
    }

}

class Bike extends Mileage {

    double fuel;
    Bike(double distance,double fuel){
        super(distance);
        this.fuel=fuel;
    }
    public void Calculate(){
        System.out.printf("Bike"+"\nMileage: %.2f km/litre\n\n", distance/fuel);
    }

}

class EVScooter extends Mileage {

    double BatterConsumed;

    EVScooter (double distance,double BatterConsumed){
        super(distance);
        this.BatterConsumed=BatterConsumed;

    }

    public void Calculate() {
        System.out.printf("EVScooter"+"\nMileage: %.2f km/litre\n\n", distance/BatterConsumed);
    }
}

class EVCar extends Mileage{
    double BatterConsumed;

    EVCar(double distance,double BatterConsumed){
        super(distance);
        this.BatterConsumed=BatterConsumed;
        System.out.printf("EVCar"+"\nMileage: %.2f km/litre\n\n", distance/BatterConsumed);
    }
}

class Calculate {
    public static void main(String[] args) {
         Scooter s = new Scooter(45.5,10);
         s.Calculate();
         Bike b = new Bike(60.5,10);
         b.Calculate();
         EVScooter es = new EVScooter(50.9,10);
         es.Calculate();
         EVCar ec = new EVCar(80.5,10);
         ec.Calculate();
    }
}