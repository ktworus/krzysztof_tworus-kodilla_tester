import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {



        ArrayList<Integer> numbers = new ArrayList();
        numbers= RandomGen(5000);
        System.out.println(numbers);

        int maxValue = MaxNumber(numbers);
        System.out.println("Najwyższa liczba "+maxValue);
        int minValue = MinNumber(numbers);
        System.out.println("Najniższa liczba " +minValue);
    }



    public static ArrayList RandomGen(int max) {
        int sum = 0;
        int result = 0;
        Random random = new Random();
        int temp = 0;
        ArrayList<Integer> numbers = new ArrayList();

        while (sum < max) {
            temp = random.nextInt(30);
            sum = sum + temp;
            numbers.add(temp);
            result++;

        }

        return numbers;

    }
    public static Integer MaxNumber(ArrayList numbers){
        Integer i = (Integer) Collections.max(numbers);
        return i;
    }
    public static Integer MinNumber (ArrayList numbers) {
        Integer i = (Integer) Collections.min(numbers);
        return i;
    }
}
