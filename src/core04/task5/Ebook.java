package src.core04.task5;

public class Ebook extends Portable {

    public Ebook (String brand, String model, double price, int battery) {
        super(brand, model, price, battery);
        String type= "E-book";
        setProductType(type);

    }
}