import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
        double number1, number2;
        String operator;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        number1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        number2 = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("Enter the operator:");
        operator = scanner.nextLine();

        switch (operator) {
            case "+":
                System.out.println("Output is " + (number1 + number2));
                break;
            case "-":
                System.out.println("Output is " + (number1 - number2));
                break;
            case "*":
                System.out.println("Output is " + (number1 * number2));
                break;
            case "/":
                System.out.println("Output is " + (number1 / number2));
                break;
            case "%":
                System.out.println("Output is " + (number1 % number2));
                break;
            default:
                System.out.println("Invalid operator, Please try again!");
        }
    }
}
