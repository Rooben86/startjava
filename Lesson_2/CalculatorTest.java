import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String prompt;

        do {
            System.out.println("Введите первое число:");
            calculator.num1 = scanner.nextInt();
            System.out.println("Введите второе число:");
            calculator.num2 = scanner.nextInt();
            System.out.println("Введите знак математической операции:");
            calculator.operation = scanner.next().charAt(0);
            System.out.println(calculator.calc());
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            prompt = scanner.next();
            while(!prompt.equalsIgnoreCase("yes")) {
                if (prompt.equalsIgnoreCase("no")) {
                    break;
                } else {
                    System.out.println("Хотите продолжить вычисления? [yes/no]:");
                    prompt = scanner.next();
                }
            }
        } while(prompt.equalsIgnoreCase("yes"));
    }
}