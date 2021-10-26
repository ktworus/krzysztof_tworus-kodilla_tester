public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice() {
        if (this.price < 500) {
            System.out.println("This notebook is very cheap");
        } else if (this.price > 499 && this.price < 1001) {
            System.out.println("The price is good");

        } else if (this.price > 1000 && this.price < 5000) {
            System.out.println("This notebook is quite expensive");
        }else{
                System.out.println("This notebook is very expensive");

            }

        }
        public void checkWeight () {
            if (this.weight < 1000) {
                System.out.println("This notebook is very light");
            } else if (this.weight > 1000 && this.weight < 2000) {
                System.out.println("This notebook is quite heavy");
            } else {
                System.out.println("This notebook is very heavy");

            }
        }
        public void checkYear () {
            if (this.year > 2019 && this.weight < 1000) {
                System.out.println("This notebook is almost new and is very light");
            } else if (this.year <= 2019 && this.year >= 2010 && this.weight > 1000 && this.weight <=3000) {
                System.out.println("This notebook is quite old and is quite heavy");
            } else if (this.year <= 2010 && this.year >= 2000 && this.weight > 1999 && this.weight <=5000) {
                System.out.println("This notebook is very old and is heavy");
            } else if (this.year <= 1990 && this.year > 1900 && this.weight > 5000 && this.weight <= 1000000) {
                System.out.println("This is classic!");

            } else {
                System.out.println("This notebook is out of range");

            }
        }
    }





