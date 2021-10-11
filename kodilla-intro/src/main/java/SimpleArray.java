public class SimpleArray {
    public static void main(String[] args) {
        String [] names = new String [5];
        names[0] = "Jan";
        names[1] = "Arek";
        names[2] = "Ola";
        names[3] = "Julia";
        names[4] = "Ala";
        String name = names[3];
        System.out.println(name);
        int numOfElements = names.length;
        System.out.println("Moja tablica zawiera " + numOfElements + " elementów");

    }
}
