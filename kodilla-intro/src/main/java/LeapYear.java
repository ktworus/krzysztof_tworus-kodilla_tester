public class LeapYear {
    public static void main(String[] args) {
        int year = 2000;
        int checkBy4 = year%4;
        int checkBy100 = year%100;
        int checkBy400 = year%400;

        if (checkBy4 == 0 && checkBy100!= 0){
            System.out.println("Rok Przestępny");
        }
        else if (checkBy400 == 0){
            System.out.println("Dzieli się przez 400 - Przestępny");
        }

        else {
            System.out.println("Rok nieprzestępny");
        }


    }
}