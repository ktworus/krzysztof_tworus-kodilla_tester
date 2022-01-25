package dividing;

public class Dividing {
    public String moduloCheck(int number){
        if (number % 3 == 0 && number % 5 ==0){
            return "FizzBuzz";
        }
        if (number % 3 ==0){
            return "Fizz";
        }
        if (number %5 == 0){
            return "Buzz";
        }

        return "Not dividable";
    }

}
