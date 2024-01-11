package Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {
        //Arrays.sort()
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        //Arrays.fill()
        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        //Arrays.copyOf()
        int[] thridArray = getRandomArray(10);
        System.out.println(Arrays.toString(thridArray));
        int[] fouthArray = Arrays.copyOf(thridArray, thridArray.length);
        System.out.println(Arrays.toString(fouthArray));

        Arrays.sort(fouthArray);
        System.out.println(Arrays.toString(fouthArray));
        System.out.println(Arrays.toString(thridArray));

        int[] smallArray = Arrays.copyOf(thridArray, 5);
        System.out.println(Arrays.toString(smallArray));

        int[] largeArray = Arrays.copyOf(thridArray, 15);
        System.out.println(Arrays.toString(largeArray));

        //Arrays.binarySearch() >> if found, return position in the array, otherwise -1
        // >> when use, need to sort th array first
        String[] sArray = {"Tim","Jane","Mark","Ralph","Able"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray,"Mark") >= 0){
            System.out.println("Found Mark in the sArray");
        }

        //Arrays.equal()
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5};
        if(s1 == s2){
            System.out.println("Array are equal.[use == ]");
        }else{
            System.out.println("Array are not equal.[use == ]");
        }

        if(Arrays.equals(s1,s2)){
            System.out.println("Array are equal.[use Arrays.equal()]");
        }else{
            System.out.println("Array are not equal.[use Arrays.equal()]");
        }
    }

    private static int[] getRandomArray(int len){
        Random rand = new Random();
        int[] newIntArray = new int[len];
        for (int i = 0; i < newIntArray.length; i++){
            newIntArray[i] = rand.nextInt(100);
        }
        return newIntArray;
    }
}
