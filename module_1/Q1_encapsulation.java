class Student {
    private String name;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class Q1_encapsulation {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Aahana");
        s.setMarks(92);

        System.out.println("Name : " + s.getName());
        System.out.println("Marks : " + s.getMarks());
    }
}