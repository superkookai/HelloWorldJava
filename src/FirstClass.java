public class FirstClass {
    // Short-cut >> psvm
    public static void main(String[] args) {
        System.out.println("Hello World!");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It's not an Alien!");
            System.out.println("And I am scared of Aliens!");
        }

        int topScore = 100;
        if (topScore == 100){
            System.out.println("You got the highest score!");
        }
        int secondTopScore = 80;
        if (topScore > secondTopScore && topScore <= 100){
            System.out.println("Greater than second top score and less than 100");
        }
        if (topScore > 90 || secondTopScore < 90){
            System.out.println("Either of conditions is true");
        }

        String makeOfCar = "BMW";
        boolean isDomestic = makeOfCar == "BMW" ? false : true;
        String result = isDomestic ? "It is Domestic" : "It is Abroad";
        System.out.println(result);

        //Challenge
        double num1 = 20.0;
        double num2 = 80.0;
        double answer = (num1+num2) * 100.0;
        double remainder = answer % 40.0;
        boolean hasRemainder = (remainder == 0.0) ? false : true;
        if (hasRemainder){
            System.out.println("Has remainder");
        }else{
            System.out.println("Not has remainder");
        }


    }
}
