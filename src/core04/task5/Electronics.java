package src.core04.task5;

public class Electronics {
    public String productType;
    public String brand;
    public String model;
    public double price;

    public Electronics (String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void setProductType(String type){
        this.productType=type;
    }

    public void printData() {
        System.out.print("Type of product: " + productType + ", Brand: " + this.brand + ", Model: "+ this.model + ", Price: " + this.price);
    }

}
