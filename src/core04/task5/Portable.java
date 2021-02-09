package src.core04.task5;

public class Portable  extends Electronics {
    private int battery;

    public Portable (String brand, String model, double price, int battery){
        super(brand, model, price);
        this.battery = battery;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.print(" Battery: " + this.battery + "\n");

    }

}
