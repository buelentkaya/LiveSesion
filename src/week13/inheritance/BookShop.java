package week13.inheritance;

public class BookShop {
    public static void main(String[] args) {
       // Book book=new Book();

       // AudioBook audioBook=new AudioBook();
        Book bookOne = new Book("Brave new world","Fiction","A.Huxley",10);
        bookOne.title= "intro to Java";
        bookOne.author = "Savitch";
        bookOne.type = "programming";
        bookOne.price=85.90;

        System.out.println("bookOne = " + bookOne);


    }
}
