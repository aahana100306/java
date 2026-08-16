class Display {

    void show() {
        System.out.println("Welcome!");
    }

    void show(String name) {
        System.out.println("Welcome " + name);
    }
}

class Greeting extends Display {

    @Override
    void show() {
        System.out.println("Good Morning!");
    }
}

public class Q4_overloading_overriding {

    public static void main(String[] args) {

        Display d = new Display();

        d.show();
        d.show("Aahana");

        Greeting g = new Greeting();

        g.show();
    }
}