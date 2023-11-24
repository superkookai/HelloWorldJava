public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("100 inches is " + convertToCentimeters(100) + " centimeters");
        System.out.println("8 feet 55 inches is " + convertToCentimeters(8,55) + " centimeters");
    }

    public static double convertToCentimeters(int heightInInches){
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches){
        int totalHeightInInches = (heightInFeet * 12) + remainingHeightInInches;
        return convertToCentimeters(totalHeightInInches);
    }
}
