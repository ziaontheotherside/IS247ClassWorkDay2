package Chapter11ObjectOriented.Challenge1.Solution;

// Book class (Parent class)
public class Book {
    // Properties
    String title;
    String author;

    // Constructor to initialize title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

