package src.core04.task5;

public class TV extends Static {
    public TV (String brand, String model, double price){
        super(brand, model, price);
        String type= "TV";
        setProductType(type);
    }
}
