package week13.inheritance;

public class Book {
    String title;
    String type;
    String author;
    double price;

    public Book(String title, String type, String author, double price) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
    }


    public void buy(){
        System.out.println("Buy this product");
    }
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

}
