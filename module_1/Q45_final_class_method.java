final class Vehicle {

    void start() {
        System.out.println("Vehicle is starting.");
    }

    final void stop() {
        System.out.println("Vehicle has stopped.");
    }
}

public class Q45_final_class_method {

    public static void main(String[] args) {

        Vehicle v = new Vehicle();

        v.start();
        v.stop();
    }
}