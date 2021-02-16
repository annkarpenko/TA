package src.core05;


import java.io.*;
import java.util.*;

public class FileOperation {
    private static Object SortedMap;

    public static void main (String[] args) {
        fileOperations("src/core05/files/CountryCodes.txt", "src/core05/files/CountryCodes_new.txt");

    }

    public static void fileOperations (String inputPath, String outputPath) {
        File file = new File(inputPath);
        try{
            FileReader fileReader = new FileReader(file);
            System.out.println("Data from the first file:");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            Map<String, String> readList = new TreeMap<String, String>();
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                String code1 = line.substring(0,2);
                String country1 = line.substring(3);
                Object line2= readList.put(code1, country1);
            }

            System.out.println("Sorting data ...");
            for (Map.Entry<String, String> mapData : readList.entrySet()) {
                System.out.println(mapData.getKey() + " " + mapData.getValue());
            }

            FileWriter fileWriter = new FileWriter(outputPath);
            for (Map.Entry<String, String> mapData: readList.entrySet()) {
                String line2 = mapData.toString();
                fileWriter.write(line2);
                fileWriter.write("\n");
            }
            System.out.println("File has been recorded");

            fileWriter.close();
            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
