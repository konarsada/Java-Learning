import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String again = "y";

        while (again.equalsIgnoreCase("y")) {
            System.out.print("Enter first number: ");
            double firstNumber = input.nextDouble();

            System.out.print("Enter second number: ");
            double secondNumber = input.nextDouble();

            System.out.print("Choose operation (+, -, *, /): ");
            String operation = input.next();

            double result = 0.0;

            if (operation.equals("+")) {
                result = firstNumber + secondNumber;
            } else if (operation.equals("-")) {
                result = firstNumber - secondNumber;
            } else if (operation.equals("*")) {
                result = firstNumber * secondNumber;
            } else if (operation.equals("/")) {
                if (secondNumber == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    result = firstNumber / secondNumber;
                }
            }

            if (!(operation.equals("/") && secondNumber == 0)) {
                System.out.println("Result: " + (double) result);
            }

            System.out.print("Do you want to calculate again? (y/n): ");
            again = input.next();
        }

        input.close();
        System.out.println("Thank you for using the calculator.");
    }
}
