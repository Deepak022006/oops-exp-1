// BookDemo.java
public class BookDemo {
    public static void main(String[] args) {
        // Create objects of Book
        Book book1 = new Book();
        Book book2 = new Book();

        // Assign values to book1
        book1.title = "Java Programming";
        book1.author = "James Gosling";
        book1.price = 499.99;

        // Assign values to book2
        book2.title = "Python Basics";
        book2.author = "Guido van Rossum";
        book2.price = 299.50;

        // Call methods
        book1.displayDetails();
        book1.checkAffordable();

        System.out.println(); // Line break

        book2.displayDetails();
        book2.checkAffordable();
    }
}

// Define the Book class
class Book {
    // Member variables (fields)
    String title;
    String author;
    double price;

    // Member function to display book details
    void displayDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : ₹" + price);
    }

    // Member function to check if book is affordable (less than ₹400)
    void checkAffordable() {
        if (price < 400) {
            System.out.println("This book is affordable.");
        } else {
            System.out.println("This book is expensive.");
        }
    }
}