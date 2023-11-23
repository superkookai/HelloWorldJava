import java.util.Arrays;
import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] intRandom = new int[5];
        for (int i = 0; i < intRandom.length; i++) {
            intRandom[i] = rand.nextInt();
        }
        System.out.println("intRandom: " + Arrays.toString(intRandom));

        int[] intRandom2 = new int[5];
        for (int i = 0; i < intRandom2.length; i++) {
            intRandom2[i] = rand.nextInt(5);
        }
        System.out.println("intRandom2: " + Arrays.toString(intRandom2));

        double[] doubleRandom = new double[5];
        for (int i = 0; i < doubleRandom.length; i++) {
            doubleRandom[i] = rand.nextDouble();
        }
        System.out.println("doubleRandom: " + Arrays.toString(doubleRandom));
    }
}
