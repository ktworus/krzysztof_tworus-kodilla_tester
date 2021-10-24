import java.lang.Object;
public class Book {
    private static String author;
    private static String title;


    public static void main(String[] args) {

        Book book = new Book();
        Book.of("Isaac Asimov ", "The Galaxy");


    }



    public static Object of(String author, String title) {

       String joined = author + title;
       Object oJoined = joined;
       return joined;

    }
}
