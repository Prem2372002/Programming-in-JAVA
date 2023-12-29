
class Vehicle {
    protected double speed;

    public Vehicle(double speed) {
        this.speed = speed;
    }

    public double calculateSpeed() {
        return speed;
    }
}


class Car extends Vehicle {
    private int numPassengers;

    public Car(double speed, int numPassengers) {
        super(speed);
        this.numPassengers = numPassengers;
    }


    @Override
    public double calculateSpeed() {
        return super.calculateSpeed() * numPassengers;
    }
}


class Motorcycle extends Vehicle {
    private int numWheels;

    public Motorcycle(double speed, int numWheels) {
        super(speed);
        this.numWheels = numWheels;
    }


    @Override
    public double calculateSpeed() {
        return super.calculateSpeed() * numWheels;
    }
}


public class VehicleHierarchyDemo {
    public static void main(String[] args) {
        
        Car car = new Car(100.0, 4);
        Motorcycle motorcycle = new Motorcycle(120.0, 2);

       
        double carSpeed = car.calculateSpeed();
        double motorcycleSpeed = motorcycle.calculateSpeed();


        String fastestVehicle;
        if (carSpeed > motorcycleSpeed) {
            fastestVehicle = "Car";
        } else if (carSpeed < motorcycleSpeed) {
            fastestVehicle = "Motorcycle";
        } else {
            fastestVehicle = "Both have the same speed";
        }

        System.out.println("Car Speed: " + carSpeed);
        System.out.println("Motorcycle Speed: " + motorcycleSpeed);
        System.out.println("The fastest vehicle is: " + fastestVehicle);
    }
}
