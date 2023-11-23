public class Car {
    public int wheels;
    public int doors;
    public String engine;

    public Car(int wheels,int doors,String engine){
        this.wheels = wheels;
        this.doors = doors;
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public String getEngine() {
        return engine;
    }
}

class Main{
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car(4,4,"1500cc");
        cars[1] = new Car(4,4,"1300cc");
        cars[2] = new Car(4,2,"2500cc");

        for (int i = 0; i < cars.length; i++) {
            System.out.println("cars[" + i + "] has " + cars[i].getWheels() + " wheels/ "
                    + cars[i].getDoors() + " doors/ " +  cars[i].getEngine() + " engine");
        }
    }
}
