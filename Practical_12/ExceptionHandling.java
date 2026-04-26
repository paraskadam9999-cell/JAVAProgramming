import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char op = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;

            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero!");
                    }
                    result = num1 / num2;
                    break;

                default:
                    throw new IllegalArgumentException("Invalid operator!");
            }

            System.out.println("Result = " + result);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numeric values.");

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Unexpected error occurred!");

        } finally {
            sc.close();
            System.out.println("Calculator closed successfully.");
        }
    }
}