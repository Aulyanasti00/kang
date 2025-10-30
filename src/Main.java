public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("HARRY POTTER");
        book.setAuthor("J.K ROWLING");
        book.setStock(15);
        book.setPrice(200000);

        Library library = new Library();
        library.setBook(book);
        library.setLocation("Perpustakaan Nasional");

        library.displayLibraryInfo();
    }
}
