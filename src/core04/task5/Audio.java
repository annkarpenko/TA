package src.core04.task5;

public class Audio extends Static {
     public Audio (String brand, String model, double price){
         super(brand, model, price);
         String type= "Audio";
         setProductType(type);
     }

    @Override
    public void printData() {
        super.printData();
        System.out.print("\n");

    }
}


