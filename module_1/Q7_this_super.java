class Parent {
    String city = "Delhi";
}

class Child extends Parent {
    String city = "Noida";
    Child() {
        System.out.println("Using this: " + this.city);
        System.out.println("Using super: " + super.city);
    }
}

public class Q7_this_super {
    public static void main(String[] args) {
        Child c = new Child();
    }
}