package src.Core02.Task3;
import com.sun.org.apache.xml.internal.utils.res.CharArrayWrapper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        byte minByte=Byte.MIN_VALUE;
        byte maxByte=Byte.MAX_VALUE;
        short minShort=Short.MIN_VALUE;
        short maxShort=Short.MAX_VALUE;
        char minChar=Character.MIN_VALUE;
        char maxChar=Character.MAX_VALUE;
        int minInt=Integer.MIN_VALUE;
        int maxInt=Integer.MAX_VALUE;
        long minLong=Long.MIN_VALUE;
        long maxLong=Long.MAX_VALUE;
        float minFloat=Float.MIN_VALUE;
        float maxFloat=Float.MAX_VALUE;
        double minDouble=Double.MIN_VALUE;
        double maxDouble=Double.MAX_VALUE;

        System.out.print("Input type of data (byte/ short/ char/ int/ long/ float/ double):");
        String type = in.nextLine();

        switch (type.toLowerCase()) {
            case "byte":
                System.out.println("Min value: " + minByte + "; Max value " + maxByte);
                break;
            case "short":
                System.out.println("Min value: " + minShort + "; Max value " + maxShort);
                break;
            case "char":
                System.out.println("Min value: " + minChar + "; Max value " + maxChar);
                break;
            case "int":
                System.out.println("Min value: " + minInt + "; Max value " + maxInt);
                break;
            case "long":
                System.out.println("Min value: " + minLong + "; Max value " + maxLong);
                break;
            case "float":
                System.out.println("Min value: " + minFloat + "; Max value " + maxFloat);
                break;
            case "double":
                System.out.println("Min value: " + minDouble + "; Max value " + maxDouble);
                break;
            default:
                System.out.println("Wrong type (");
                break;
        }
    }
}
