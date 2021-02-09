package src.core04.task5;

public class Headphones extends Portable {

    public Headphones (String brand, String model, double price, int battery) {
        super(brand, model, price, battery);
        String type= "Headphones";
        setProductType(type);
    }

}
