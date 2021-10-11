public class Loops {
    public static void main(String[] args) {

        int[] numbers = new int[]{5, 2, 52};
        int result = sumAndDisplay(numbers);
        System.out.println(result);
    }
    public static int sumAndDisplay(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            sum = sum + num;
        }
            return sum;
        }


    }


