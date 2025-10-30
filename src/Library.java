public class Library {
    private Book book;
    private String location;

    // Introduce Constant
    private static final double TAX_RATE = 0.1;

    public void setBook(Book book) { this.book = book; }
    public void setLocation(String location) { this.location = location; }

    public void displayLibraryInfo() {
        System.out.println("Library Location: " + location);

        if (book != null) {
            book.displayInfo();
        } else {
            System.out.println("No book data available.");
        }

        // Hitung total harga dengan pajak
        assert book != null;
        double totalPrice = book.getPrice() * book.getStock();
        double finalPrice = totalPrice + (totalPrice * TAX_RATE);
        System.out.println("Total Price with Tax: " + finalPrice);
    }
}
