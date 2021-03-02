package src.core08;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //A.Arr with numbers from 1 to 10.
        Object[] numbers1 = new Object[10];
        for (int i=0; i < numbers1.length; i++){
            numbers1[i]=i + 1;
        }
        System.out.println(Arrays.toString(numbers1));

        //“Five” instead of number 5;
        numbers1[4] = "Five";

        //print without 7
        for (int i=0; i < 10; i++){
            if (i != 6 ){
                System.out.println("Numbers " + numbers1[i]);
            }
        }

        //B.Arr with numbers from 0 to 20
        int[] numbers2 = new int[21];
        for (int i = 0; i < numbers2.length; i++){
            numbers2[i]=i;
        }
        System.out.println(Arrays.toString(numbers2));

        // backward order
        for (int i=0; i < numbers2.length / 2; i++ ){
            int temp = numbers2[i];
            numbers2[i] = numbers2[numbers2.length - i - 1];
            numbers2[numbers2.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(numbers2));

    }
}


