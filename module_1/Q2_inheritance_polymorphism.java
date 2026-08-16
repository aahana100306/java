class Vehicle {

    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

public class Q2_inheritance_polymorphism {

    public static void main(String[] args) {

        Vehicle v = new Car();

        v.start();
    }
}