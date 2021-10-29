import java.lang.Object;
public class Book {
    public static void main(String[] args) {

        Book book = Book.of("Isaac Asimov", "The Galaxy");

    }

    private  String author ;
    private  String title ;



    public static Book of(String author, String title) {
        Book books = new Book();
        books.author = author;
        books.title = title;
        System.out.println(books.author + books.title);
        return books;

    }








}
