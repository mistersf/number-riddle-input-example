import java.util.Scanner;

public class NumberRiddle {
    public static void main(String[] args) {
        int positiveInteger = 100;
        int negativeInteger = -100;
        int zero = 0;
        int one = 1;
        double positiveDouble = 1.23;
        double negativeDouble = -1.23;

        ExecuteNumberRiddle(positiveInteger);
        ExecuteNumberRiddle(negativeInteger);
        ExecuteNumberRiddle(zero);
        ExecuteNumberRiddle(one);
        ExecuteNumberRiddle(positiveDouble); // https://0.30000000000000004.com/
        ExecuteNumberRiddle(negativeDouble);

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number or q to quit: ");
            String userInput = sc.nextLine();
            if (userInput.equals("q"))
                break;
            try {
                ExecuteNumberRiddle(Double.parseDouble(userInput));
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input.");
            }
        }

    }

    private static void ExecuteNumberRiddle(double initialNumber) {
        System.out.println("Doing riddle for " + initialNumber);
        double doubled = initialNumber * 2;
        System.out.println("Doubled: " + doubled);
        double addedSix = doubled + 6;
        System.out.println("Added 6: " + addedSix);
        double halved = addedSix / 2;
        System.out.println("Halved: " + halved);
        double subtracted = halved - initialNumber;
        System.out.println("Minus Original: " + subtracted);
        System.out.println();
    }
}