package OOPSinJAVA;

class Book {
    String title;
    String author;
    double price;

    // Parameterized Constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Copy Constructor
    Book(Book b) {
       title = b.title;
        author = b.author;
        price = b.price;
    }

    // Display Method
    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }
}

public class copyConstructor{
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "Deepu", 499.99);
        Book b2 = new Book(b1); // Copying b1 into b2

        b1.display();
        b2.display();
    }
}
