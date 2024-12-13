interface Vehicle {
    void changeGear(int newGear);
    void speedUp(int increment);
    void applyBrakes(int decrement);
}

class Bicycle implements Vehicle {
    int speed;
    int gear;

    Bicycle() {
        speed = 0;
        gear = 1;
    }

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
        System.out.println("Bicycle gear changed to: " + gear);
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Bicycle speed increased to: " + speed + "km/h");
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
        System.out.println("Bicycle speed decreased to: " + speed + "km/h");
    }
}

class Bike implements Vehicle {
    int speed;
    int gear;

    Bike() {
        speed = 0;
        gear = 1;
    }

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
        System.out.println("Bike gear changed to: " + gear);
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Bike speed increased to: " + speed + "km/h");
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
        System.out.println("Bike speed decreased to: " + speed + "km/h");
    }
}

class Car implements Vehicle {
    int speed;
    int gear;

    Car() {
        speed = 0;
        gear = 1;
    }

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
        System.out.println("Car gear changed to: " + gear);
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Car speed increased to: " + speed + "km/h");
    }

    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
        System.out.println("Car speed decreased to: " + speed + "km/h");
    }
}

class Main5 {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(10);
        bicycle.applyBrakes(7);

        Bike bike = new Bike();
        bike.changeGear(3);
        bike.speedUp(30);
        bike.applyBrakes(20);

        Car car = new Car();
        car.changeGear(4);
        car.speedUp(60);
        car.applyBrakes(45);
    }
}
