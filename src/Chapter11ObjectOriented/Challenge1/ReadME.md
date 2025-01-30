# Book Management Challenge

## Problem Statement
You are tasked with creating a simple program to manage books in a library. Follow the steps below to implement the solution.

## Requirements
### Create a `Book` Class
1. Define two properties in the `Book` class:
   - `title` (String): Represents the title of the book.
   - `author` (String): Represents the author of the book.
2. Implement a method named `displayDetails` in the `Book` class. This method should print the book's title and author in the following format:
   ```
   Title: [title], Author: [author]
   ```

### Implement the Main Method
1. Create an object of the `Book` class.
2. Set the `title` and `author` properties for the object.
3. Call the `displayDetails` method to display the book's details.

## Expected Output
If the `title` is set to **"The Great Gatsby"** and the `author` is set to **"F. Scott Fitzgerald"**, the output should be:
```text
Title: The Great Gatsby, Author: F. Scott Fitzgerald
```

## Instructions
1. Create a new Java file (e.g., `Main.java`).
2. Implement the `Book` class and the main method as described above.
3. Run the program to verify that the output matches the expected result.

## Example Implementation
```java
class Book {
    String title;
    String author;

    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.title = "The Great Gatsby";
        myBook.author = "F. Scott Fitzgerald";
        myBook.displayDetails();
    }
}
```

## Running the Program
Compile and run the Java program using:
```sh
javac Main.java
java Main
```

Ensure the output matches the expected result. Happy coding! 🚀

