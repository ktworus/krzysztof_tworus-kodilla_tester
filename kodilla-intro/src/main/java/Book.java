import java.lang.Object;
public class Book {
    public static void main(String[] args) {

        Book book = Book.of("Isaac Asimov", "The Galaxy");

    }



    private static String author = "Isaac Asimov ";
    private static String title = "The Galaxy";



    public static Book of(String author, String title) {
        Book books = new Book();
        System.out.println(books.author + books.title);
        return books;

    }








}
