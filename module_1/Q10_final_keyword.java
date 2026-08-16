final class Demo {

    final int number = 10;
    final void display() {
        System.out.println("Final Variable: " + number);
        System.out.println("This is a final method.");
    }
}

public class Q10_final_keyword {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
    }
}