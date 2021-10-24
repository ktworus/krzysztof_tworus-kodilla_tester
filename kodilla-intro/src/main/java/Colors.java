import java.util.ArrayList;
import java.util.Scanner;

public class Colors {

    public static void main(String[] args) {

        Colors selectedColor = new Colors();
        String color = selectedColor.getColor();

        System.out.println(color);

    }

    public static String getLetter() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first letter of color:");
        String firstLetter = scanner.next();
        return firstLetter;

    }

    public String getColor() {
        String userSelected = getLetter();

        switch (userSelected) {
            case "A":
                return "Antracyt";

            case "B":
                return "Biały";

            case "C":
                return "Czarny";

            case "D":
                return "Zielony";

            default:
                System.out.println("No such color.");
        } return userSelected;
    }
}



