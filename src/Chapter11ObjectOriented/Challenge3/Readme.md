# Updated Code with Polymorphism

## Problem Statement
Enhance the existing `Book` class by demonstrating **polymorphism** through method overriding in Java.

---

## **Updated Code with Polymorphism**

```java
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

    // Polymorphic method: printSummary
    void printSummary() {
        System.out.println("This is a book titled '" + title + "' by " + author + ".");
    }
}

// EBook class (Child class inheriting from Book)
class EBook extends Book {
    // Additional property
    double fileSize; // in MB

    // Constructor to initialize title, author, and fileSize
    public EBook(String title, String author, double fileSize) {
        super(title, author); // Call the parent class constructor
        this.fileSize = fileSize;
    }

    // Method to display eBook details (overrides the parent class method)
    @Override
    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", File Size: " + fileSize + " MB");
    }

    // Override the polymorphic method: printSummary
    @Override
    void printSummary() {
        System.out.println("This is an eBook titled '" + title + "' by " + author + " with a file size of " + fileSize + " MB.");
    }
}

// Main class to test the Book and EBook classes
public class Main {
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        System.out.println("Book Details:");
        book.displayDetails();
        book.printSummary(); // Calls the Book class's printSummary method

        // Create an EBook object
        EBook ebook = new EBook("Clean Code", "Robert C. Martin", 5.2);
        System.out.println("\nEBook Details:");
        ebook.displayDetails();
        ebook.printSummary(); // Calls the EBook class's printSummary method

        // Polymorphism in action
        System.out.println("\nPolymorphism Example:");
        Book polymorphicBook = new EBook("1984", "George Orwell", 3.8);
        polymorphicBook.printSummary(); // Calls the EBook class's printSummary method
    }
}
```

---

## **Explanation of the Code**

### **Polymorphic Method:**
- The `printSummary()` method is defined in the `Book` class and **overridden** in the `EBook` class.
- When called on a `Book` object, it prints a summary for a **regular book**.
- When called on an `EBook` object, it prints a summary for an **eBook**, including the **file size**.

### **Polymorphism in Action:**
- In the `Main` class, a **Book reference** (`polymorphicBook`) is used to point to an **EBook** object.
- When `printSummary()` is called on this reference, the overridden method in the **EBook class** is executed, demonstrating **runtime polymorphism**.

### **Method Overriding:**
- The `printSummary()` method in the `EBook` class **overrides** the method in the `Book` class to provide a **specialized implementation**.

---

## **Output**
When you run the program, the output will be:

```
Book Details:
Title: The Great Gatsby, Author: F. Scott Fitzgerald
This is a book titled 'The Great Gatsby' by F. Scott Fitzgerald.

EBook Details:
Title: Clean Code, Author: Robert C. Martin, File Size: 5.2 MB
This is an eBook titled 'Clean Code' by Robert C. Martin with a file size of 5.2 MB.

Polymorphism Example:
This is an eBook titled '1984' by George Orwell with a file size of 3.8 MB.
```

---

## **Key Points**

### **Polymorphism:**
- The same method (`printSummary`) behaves **differently** based on the object's type (`Book` or `EBook`).

### **Method Overriding:**
- The `EBook` class **overrides** the `printSummary` method to provide a **specialized implementation**.

### **Runtime Polymorphism:**
- A **Book reference** pointing to an **EBook object** calls the **overridden method** in the `EBook` class.

---


## **Solution Link**
🔗 [Click here to view the solution](https://github.com/shivasharma/IS247ClassWork/blob/master/src/Chapter11ObjectOriented/Challenge3)

---
