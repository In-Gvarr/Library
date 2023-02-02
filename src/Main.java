public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("123456789", "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("987654321", "To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("121212121", "Pride and Prejudice", "Jane Austen");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();
    }
}