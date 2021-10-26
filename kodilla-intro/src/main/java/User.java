
public class User {

    public static void main(String[] args) {

        User user1 = new User(20, "Anna");
        User user2 = new User(15, "Jan");
        User user3 = new User(25, "John");
        User user4 = new User(36, "Peter");
        User user5 = new User(55, "Ela");
        User user6 = new User(78, "Ola");
        User user7 = new User(130, "Kazik");
        User[] users = {user1, user2, user3, user4, user5, user6, user7};

        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            int age = users[i].getAge();
            sum = sum + age;
        }
        double average = sum/ users.length;
        System.out.println("Below average age " +  average+ " :");

        for(int i=0; i< users.length; i++){
            int age = users[i].getAge();
            if(age<average){

                String name = users[i].getName();
                System.out.println(name);
            }

        }

    }

    String name;
    int age;

    public User (int age, String name) {
        this.age = age;
        this.name = name;

    }
    public int getAge() {
        return this.age;

    }
    public String getName(){
        return this.name;
    }



}

