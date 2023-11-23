import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] intArray = {2,13,8,77,555};
        int[] newIntArray = intArray.clone(); //Array is Reference type if assign like normal will get the location address
        newIntArray[0] = 234;
        System.out.println("intArray[0] has no effect, value is " + intArray[0]);

        //Other Array copy methods >> System.arraycopy() , Arrays.copyOf()

        System.out.println("intArray is " + Arrays.toString(intArray));
    }
}
