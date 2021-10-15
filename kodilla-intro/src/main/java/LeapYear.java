public class LeapYear {
    public static void main(String[] args) {


        int year = 1976;

        boolean rokPrzestepny =  leapYear(year);
        System.out.println(rokPrzestepny);


    }
    public static boolean leapYear(int rok){

        int checkBy4 = rok%4;
        int checkBy100 = rok%100;
        int checkBy400 = rok%400;

        if (checkBy4 == 0 && checkBy100!= 0){
            //System.out.println("Rok Przestępny");
            return true;
        }
        else if (checkBy400 == 0){
            //System.out.println("Dzieli się przez 400 - Przestępny");
            return true;
        }

        else {
            //System.out.println("Rok nieprzestępny");

            return false;
        }


    }


}