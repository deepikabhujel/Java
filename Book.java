public class Book {
    String book_name;
    String ISBN;
    String author;
    int price;
     
    void display() {
        this.book_name = "Diary of a Young Girl"; 
        this.ISBN = "A2C4"; // String values must be in double quotes
        this.author = "Anne Frank";
        this.price = 500;
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.display(); 

        System.out.println("Name of the book: " + b.book_name);
        System.out.println("ISBN: " + b.ISBN);
        System.out.println("Author: " + b.author);
        System.out.println("Price: " + b.price);
    }
}
