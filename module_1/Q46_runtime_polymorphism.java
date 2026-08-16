class Payment {

    void pay() {
        System.out.println("Making a payment.");
    }
}

class Cash extends Payment {

    @Override
    void pay() {
        System.out.println("Payment made using cash.");
    }
}

class Card extends Payment {

    @Override
    void pay() {
        System.out.println("Payment made using card.");
    }
}

public class Q46_runtime_polymorphism {

    public static void main(String[] args) {

        Payment p;

        p = new Cash();
        p.pay();

        p = new Card();
        p.pay();
    }
}