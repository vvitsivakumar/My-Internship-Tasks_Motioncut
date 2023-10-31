package motioncut.task;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----------Simple Calculator----------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose an operation from the above number 1 to 4 :");

        int choice = input.nextInt();

        System.out.print("Enter your first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter your second number: ");
        double num2 = input.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Your choice is invalid");
                System.exit(0);
        }

        System.out.println("Answer: " + result);
    }
}

