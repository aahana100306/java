package shapes;
public class Rectangle implements Shape {
    double length;
    double breadth;
    public Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
    public double area() {
        return length * breadth;
    }
    public double perimeter() {
        return 2 * (length + breadth);
    }
}