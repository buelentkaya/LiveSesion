package week13.inheritance;

public class AudioBook extends Book {
    int length;
    String narrator;

   public AudioBook(String title, String type, String author, double price){
       super(title,type,author,price);
   }

    public void listen(){
        System.out.println("Listening to AudioBook");
        System.out.println("title of the book"+title);
        System.out.println("author"+author);
        System.out.println("Type of the book"+type);
        System.out.println("price of the book"+price);


    }
}
