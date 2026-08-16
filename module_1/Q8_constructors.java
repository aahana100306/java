class Laptop {
    String brand;
    Laptop() {
        brand = "HP";
    }

    Laptop(String b) {
        brand = b;
    }

    void display() {
        System.out.println("Brand: " + brand);
    }
}

public class Q8_constructors {

    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop("Dell");
        l1.display();
        l2.display();
    }
}