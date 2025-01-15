import javax.swing.*;

class Book {
    private String title;
    private String author;
    private String isbn;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    
    public static void manageBooks(Book[] books, int currentBookCount) {
        boolean continueProgram = true;

        while (continueProgram) {
            String menuOption = JOptionPane.showInputDialog(null,
                "Select an option:\n1. Add a book\n2. Remove a book\n3. Display all books\n4. Exit");

            switch (menuOption) {
                case "1":
                    currentBookCount = addNewBook(books, currentBookCount);
                    break;
                case "2":
                    currentBookCount = deleteBook(books, currentBookCount);
                    break;
                case "3":
                    showAllBooks(books, currentBookCount);
                    break;
                case "4":
                    continueProgram = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option, please try again.");
            }
        }
    }

    public static int addNewBook(Book[] books, int currentBookCount) {
        String title = JOptionPane.showInputDialog("Enter the book title:");
        String author = JOptionPane.showInputDialog("Enter the book author:");
        String isbn = JOptionPane.showInputDialog("Enter the book ISBN:");

        Book newBook = new Book();
        newBook.setTitle(title);
        newBook.setAuthor(author);
        newBook.setIsbn(isbn);

        
        if (currentBookCount < books.length) {
            books[currentBookCount] = newBook;
            JOptionPane.showMessageDialog(null, "Book added: " + getBookDetails(newBook));
            currentBookCount++;
        } else {
            JOptionPane.showMessageDialog(null, "Cannot add more books. The collection is full.");
        }

        return currentBookCount;
    }

    
    public static int deleteBook(Book[] books, int currentBookCount) {
        String isbnToRemove = JOptionPane.showInputDialog("Enter the ISBN of the book to remove:");

        boolean removed = false;
        for (int i = 0; i < currentBookCount; i++) {
            if (books[i].getIsbn().equals(isbnToRemove)) {
                for (int j = i; j < currentBookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[currentBookCount - 1] = null;
                currentBookCount--;
                JOptionPane.showMessageDialog(null, "Book removed.");
                removed = true;
                break;
            }
        }

        if (!removed) {
            JOptionPane.showMessageDialog(null, "No book found with ISBN: " + isbnToRemove);
        }

        return currentBookCount;
    }

   
    public static void showAllBooks(Book[] books, int currentBookCount) {
        if (currentBookCount == 0) {
            JOptionPane.showMessageDialog(null, "No books in the list.");
        } else {
            StringBuilder bookList = new StringBuilder("Books in the collection:\n");
            for (int i = 0; i < currentBookCount; i++) {
                bookList.append(getBookDetails(books[i])).append("\n");
            }
            JOptionPane.showMessageDialog(null, bookList.toString());
        }
    }

    public static String getBookDetails(Book book) {
        return "Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn();
    }

    public static void main(String[] args) {
        Book[] books = new Book[10];
        int currentBookCount = 0;
        manageBooks(books, currentBookCount);
    }
}