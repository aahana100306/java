class Grandparent {

    void house() {
        System.out.println("Grandparent owns a house.");
    }
}

class Parent extends Grandparent {

    void car() {
        System.out.println("Parent owns a car.");
    }
}

class Child extends Parent {

    void bike() {
        System.out.println("Child owns a bike.");
    }
}

public class Q42_multilevel_inheritance {

    public static void main(String[] args) {

        Child c = new Child();

        c.house();
        c.car();
        c.bike();
    }
}