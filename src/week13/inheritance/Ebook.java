package week13.inheritance;

public class Ebook extends Book{
    int size;
    int pages;

    public Ebook(String title, String type, String author,double price){

        super(title,type,author,price);
    }

    public void readBook(){
        System.out.println("pages of the book"+pages);
        System.out.println("size of the book"+size);
        System.out.println("title of the book"+title);
        System.out.println("auther"+author);
        System.out.println("Type of the book"+type);

    }
}
