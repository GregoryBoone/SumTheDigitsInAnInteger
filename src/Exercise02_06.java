import java.util.Scanner;

public class Exercise02_06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        SumDigitsInInteger myObject = new SumDigitsInInteger();

        System.out.println("Enter an integer between 0 and 1000:");
        int userInt = scanner.nextInt();

        System.out.println("The sum of all digits in " + userInt + " is " + myObject.sumEmUp(userInt));


    }
}
