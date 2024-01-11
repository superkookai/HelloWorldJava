package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArraysExample02 {

    public static void main(String[] args) {
        Integer[] myArray = generateIntArray(10);
        System.out.println("myArray is " + Arrays.toString(myArray));
        Arrays.sort(myArray, Collections.reverseOrder());
        System.out.println("Sorted myArray decending: " + Arrays.toString(myArray));
    }

    private static Integer[] generateIntArray(int len){
        Integer[] newIntArray = new Integer[len];
        Random rand = new Random();
        for (int i =0; i < newIntArray.length; i++) {
            newIntArray[i] = rand.nextInt(100);
        }
        return newIntArray;
    }
}
