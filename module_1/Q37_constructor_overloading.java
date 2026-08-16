class Student {

    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 18;
    }

    Student(String n) {
        name = n;
        age = 18;
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Q37_constructor_overloading {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Aahana");
        Student s3 = new Student("Riya", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}