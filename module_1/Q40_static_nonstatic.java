class Demo {

    static void staticMethod() {

        System.out.println("This is a static method.");
    }

    void nonStaticMethod() {

        System.out.println("This is a non-static method.");
    }
}

public class Q40_static_nonstatic {

    public static void main(String[] args) {

        Demo.staticMethod();

        Demo d = new Demo();

        d.nonStaticMethod();
    }
}