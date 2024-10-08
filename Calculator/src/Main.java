import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // switch-case ile hesap makinesi

        double number1, number2, result;
        char operator;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();

        System.out.print("Enter the operator: ");
        operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("You cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}