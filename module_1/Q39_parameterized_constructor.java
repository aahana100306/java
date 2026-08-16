class Employee {

    int id;
    String name;

    Employee(int i, String n) {

        id = i;
        name = n;
    }

    void display() {

        System.out.println("ID: " + id);

        System.out.println("Name: " + name);
    }
}

public class Q39_parameterized_constructor {

    public static void main(String[] args) {

        Employee e = new Employee(101, "Aahana");

        e.display();
    }
}