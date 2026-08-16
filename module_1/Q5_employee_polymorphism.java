class Employee {

    void work() {
        System.out.println("Employee is working.");
    }
}

class Teacher extends Employee {

    @Override
    void work() {
        System.out.println("Teacher is teaching students.");
    }
}

class Engineer extends Employee {

    @Override
    void work() {
        System.out.println("Engineer is designing software.");
    }
}

public class Q5_employee_polymorphism {

    public static void main(String[] args) {

        Employee e;

        e = new Teacher();
        e.work();

        e = new Engineer();
        e.work();
    }
}