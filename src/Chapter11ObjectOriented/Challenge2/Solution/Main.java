package Chapter11ObjectOriented.Challenge2.Solution;

import Chapter11ObjectOriented.Challenge1.Solution.Book;
import Chapter11ObjectOriented.Challenge1.Solution.EBook;

public class Main {

    public class Main {
        public static void main(String[] args) {
            // Create a Book object
            Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
            System.out.println("Book Details:");
            book.displayDetails();

            // Create an EBook object
            EBook ebook = new EBook("Clean Code", "Robert C. Martin", 5.2);
            System.out.println("\nEBook Details:");
            ebook.displayDetails();
        }
}
