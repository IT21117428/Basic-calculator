import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {

        char restart = 'Y';
        do {
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
            System.out.println("Do you want to constinue ? (Y/N)");
            restart = scanner.next().charAt(0);
        }
        while (restart == 'Y' || restart == 'y');
        if (restart == 'N' || restart == 'n') {
            System.out.println("Okay, have a nice day!");
        }
    }
}
