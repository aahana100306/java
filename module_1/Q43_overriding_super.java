class Parent {

    void message() {
        System.out.println("Message from parent class.");
    }
}

class Child extends Parent {

    @Override
    void message() {

        super.message();

        System.out.println("Message from child class.");
    }
}

public class Q43_overriding_super {

    public static void main(String[] args) {

        Child c = new Child();

        c.message();
    }
}