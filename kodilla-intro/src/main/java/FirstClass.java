public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(999, 599, 2020);
        System.out.println(notebook.weight +"g"+ " " + notebook.price+"$" + " " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(1001, 600, 2015);
        System.out.println(heavyNotebook.weight +"g"+" "+ heavyNotebook.price+"$"+ " " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(3000, 1001, 2010);
        System.out.println(oldNotebook.weight +"g"+ " "+ oldNotebook.price+"$"+ " " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();

        Notebook crapNotebook = new Notebook(5000, 1, 2000);
        System.out.println(crapNotebook.weight + "g"+" " + crapNotebook.price+"$"+ " " + crapNotebook.year);
        crapNotebook.checkPrice();
        crapNotebook.checkWeight();
        crapNotebook.checkYear();

        Notebook classicNotebook = new Notebook(10000, 7000, 1976);
        System.out.println(classicNotebook.weight+"g" + " " + classicNotebook.price+"$"+ " " + classicNotebook.year);
        classicNotebook.checkPrice();
        classicNotebook.checkWeight();
        classicNotebook.checkYear();



    }

}