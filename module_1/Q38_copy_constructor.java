class Book {
    String title;
    int price;
    Book(String t, int p) {
        title = t;
        price = p;
    }
    Book(Book b) {
        title = b.title;
        price = b.price;
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

public class Q38_copy_constructor {

    public static void main(String[] args) {
        Book b1 = new Book("Java", 500);
        Book b2 = new Book(b1);
        b1.display();
        b2.display();
    }
}