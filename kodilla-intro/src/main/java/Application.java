public class Application {
    String name;
    double age;
    double height;

    public static void main(String[] args) {
        Application applicant1 = new Application("Adam", 40.5, 178);
        Application applicant2 = new Application("Jan", 35, 140);
        Application applicant3 = new Application(null, 35, 200);
        applicant1.checkApplication();
        applicant2.checkApplication();
        applicant3.checkApplication();


    }




    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkApplication() {

        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
        }

    }


