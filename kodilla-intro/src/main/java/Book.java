public class Book {
    public static void main(String[] args) {

        Book book = Book.of("Isaac Asimov ", "The Galaxy");

        System.out.println(Book.of("Isaac Asimov ", "The Galaxy"));

    }

    private static String author;
    private static String title;

    public static Book of(String author, String title) {

       String joined = author + title;

       Book ojoined = joined;

       return ojoined;

    }
}
