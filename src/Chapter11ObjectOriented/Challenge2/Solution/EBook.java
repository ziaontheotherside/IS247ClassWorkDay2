package Chapter11ObjectOriented.Challenge2.Solution;

import Chapter11ObjectOriented.Challenge2.Solution.;

// EBook class (Child class inheriting from Book)
class EBook extends Book {
    // Additional property
    double fileSize; // in MB

    // Method to display eBook details (overrides the parent class method)
    @Override
    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", File Size: " + fileSize + " MB");
    }
}