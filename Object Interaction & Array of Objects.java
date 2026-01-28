class Book {
    int bookId;
    String title;
    double price;

    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book(1, "Java", 650);
        books[1] = new Book(2, "C++", 450);
        books[2] = new Book(3, "Python", 700);
        books[3] = new Book(4, "DSA", 550);
        books[4] = new Book(5, "OS", 400);

        double sum = 0;

        System.out.println("Books with price greater than 500:");
        for (Book b : books) {
            sum += b.price;
            if (b.price > 500) {
                System.out.println(b.bookId + " " + b.title + " " + b.price);
            }
        }

        double average = sum / books.length;
        System.out.println("Average Price: " + average);
    }
}
