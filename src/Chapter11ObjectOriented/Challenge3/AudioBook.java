package Chapter11ObjectOriented.Challenge3;

class Audiobook extends Book {
    double duration; // in minutes

    public Audiobook(String title, String author, double duration) {
        super(title, author);
        this.duration = duration;
    }

    @Override
    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Duration: " + duration + " minutes");
    }

    @Override
    void printSummary() {
        System.out.println("This is an audiobook titled '" + title + "' by " + author + " with a duration of " + duration + " minutes.");
    }
}