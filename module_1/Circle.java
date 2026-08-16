public class Circle{
    public double area(double radius) {
        return (double) (3.14 * radius * radius);
    }

    public double circumference(double radius) {
        return (double) (2 * 3.14 * radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.area(5));
        System.out.println(circle.circumference(5));
    }
}