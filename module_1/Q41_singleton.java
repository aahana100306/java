class Singleton {

    private static Singleton obj = new Singleton();

    private Singleton() {
        System.out.println("Singleton Object Created");
    }

    static Singleton getObject() {
        return obj;
    }

    void display() {
        System.out.println("Using Singleton Object");
    }
}

public class Q41_singleton {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getObject();

        Singleton s2 = Singleton.getObject();

        s1.display();

        if (s1 == s2) {
            System.out.println("Both objects are the same.");
        }
    }
}