public class Tryouts {
    public static void main(String[] args) {
        String word1 = "Same";
        String word2 = "AAAA";
        String word3 = "BBBB";
        String word4 = "DDDD";
        String words =  metoda1(word1,word2);
        System.out.println(words);

        metoda2(word3, word4);



    }
    public static String metoda1(String char1, String char2) {
        String result = char1 + char2;

        String result1 = result;
        return result1;

    }
    public static void metoda2(String char1, String char2){
        String result = char1 + char2;

        String result1 = result;
        System.out.println(result1);
    }


}
