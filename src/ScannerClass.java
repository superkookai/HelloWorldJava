import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);
        System.out.println("Welcome to 2 numbers summation. \nPlease enter your name: ");
        String name = objScanner.nextLine();
        System.out.println("Hello, " + name);

        int count = 1;
        int sum = 0;
        while (count<3){
            System.out.println("Please enter number" + count + " = " );
            if(objScanner.hasNextInt()){
                count++;
                int num = objScanner.nextInt();
                sum += num;
            }else{
                System.out.println("Invalid number. Please enter number again.");
            }
            objScanner.nextLine();
        }
        System.out.println("Sum is " + sum);
        objScanner.close();
    }
}
