class College {
    public String principal = "Dr. Sharma";
    private int fees = 50000;
    protected String department = "Artificial Intelligence";
    String city = "Noida";
    void display() {
        System.out.println(principal);
        System.out.println(fees);
        System.out.println(department);
        System.out.println(city);
    }
}

public class Q9_access_modifiers {
    public static void main(String[] args) {
        College c = new College();
        System.out.println("Principal: " + c.principal);
        c.display();
    }
}