package Chapter11ObjectOriented.Challenge2.Solution;


    public class Main {
        public static void main(String[] args) {
            Book book = new Book();
            book.title = "The Great Gatsby";
            book.author = "F. Scott Fitzgerald";
            System.out.println("Book Details:");
            book.displayDetails();

            // Create an EBook object
            EBook ebook = new EBook();
            ebook.title = "Clean Code";
            ebook.author = "Robert C. Martin";
            ebook.fileSize = 5.2;
            System.out.println("\nEBook Details:");
            ebook.displayDetails();
        }
    }

