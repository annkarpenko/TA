package src.Core02.Task2;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input your favorite month: ");
        String currentMonth = in.nextLine();

        Seasons season=Seasons.DEFAULT;

        switch (currentMonth.toLowerCase()){
            case "december":
            case "january":
            case "february":
                season=Seasons.WINTER;
                break;
            case "march":
            case "april":
            case "may":
                season=Seasons.SPRING;
                break;
            case "june":
            case "july":
            case "august":
                season=Seasons.SUMMER;
                break;
            case "september":
            case "october":
            case "november":
                season=Seasons.AUTUMN;
                break;
            default:
                System.out.println("Sorry, this month is wrong");
        }
        System.out.println("Your favorite season is ... " + season + "!");
    }
}
