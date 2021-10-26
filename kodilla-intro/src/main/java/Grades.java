public class Grades {
    public static void main(String[] args) {
    Grades gradesTable = new Grades();
    gradesTable.add(2);
    gradesTable.add(5);
    gradesTable.add(7);
    gradesTable.add(7);
    gradesTable.add(1);
    gradesTable.add(5);
    gradesTable.add(7);
    gradesTable.add(7);
    gradesTable.add(5);
    gradesTable.add(11);
    gradesTable.add(1000);

    System.out.println(gradesTable.averageValue());
    System.out.println(gradesTable.returnLast());
    }

    private int []gradesTable;
    private int size;

    public Grades() {
        this.gradesTable = new int[10];
        this.size = 0;
    }
    public void add(int value){
            if (this.size == 10) {
                return;
            }
            this.gradesTable[this.size] = value;
            this.size++;
        }

    public int returnLast(){
    int result = this.gradesTable[this.size-1];
    return result;
    }
    public double averageValue(){
        double sum = 0;
        double average = 0;
        for (int i = 0; i < gradesTable.length; i++) {
            int num = gradesTable[i];
            sum = sum + num;
            average = sum / this.size;
        }
        return average;
    }
}
