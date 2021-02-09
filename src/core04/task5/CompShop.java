package src.core04.task5;
import java.util.ArrayList;

public class CompShop {

    public static void main(String[] args) {
        System.out.println("Welcome to our shop");


        ArrayList<Electronics> list=new ArrayList<>();
        list.add(new Ebook("PocketBook","PB628-P-WW", 25.25, 250));
        list.add(new Headphones("Rosewill","RW-TH68N", 34.99, 240));
        list.add(new Audio("Polk Audio","TL1600", 229.99));
        list.add(new TV("LG","OLED55CXPUA", 1496.54));
        showListItems(list);
    }

    public static void showListItems(ArrayList<Electronics> list) {
        for (Electronics value: list){
            value.printData();
        }
    }
}
