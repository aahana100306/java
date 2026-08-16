abstract class Shape {

    abstract void area();

    void display() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {

    int length = 10;
    int breadth = 5;

    @Override
    void area() {
        System.out.println("Area of rectangle: " + (length * breadth));
    }
}

public class Q44_abstract_class {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        r.display();
        r.area();
    }
}