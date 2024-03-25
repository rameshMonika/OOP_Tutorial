public class Library {
    private String[] books; // Array to store books
    private int numBooks;   // Number of books currently in the library
    private int maxCapacity; // Maximum capacity of the library
    
    // Constructor to initialize the library with a maximum capacity
    public Library(int capacity) {
        books = new String[capacity];
        numBooks = 0;
        maxCapacity = capacity;
    }
    
    // Method to add a book to the library
    public void addBook(String bookTitle) throws LibraryFullException {
        if (numBooks < maxCapacity) {
            books[numBooks] = bookTitle;
            numBooks++;
            System.out.println(bookTitle + " has been added to the library.");
        } else {
            throw new LibraryFullException("The library is full. Cannot add " + bookTitle + ".");
        }
    }
    
    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("Books available in the library:");
        for (int i = 0; i < numBooks; i++) {
            System.out.println((i+1) + ". " + books[i]);
        }
    }
}


