public class Loops {
    public static void main(String[] args) {

        int[] numbers = new int[]{5, 2, 52};
        int result = sumAndDisplay(numbers);

        System.out.println(result);
    }

    public static int sumAndDisplay(int[] table) {
        int sum = 0;

        for (int i = 0; i < table.length; i++) {
            int num = table[i];
            sum = sum + num;
        }
        return sum;
    }


    }




