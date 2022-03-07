import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String prompt = "yes";

        while(prompt.equalsIgnoreCase("yes")) {
            System.out.println("Введите первое число:");
            calculator.setNum1(scanner.nextInt());
            System.out.println("Введите второе число:");
            calculator.setNum2(scanner.nextInt());
            System.out.println("Введите знак математической операции:");
            calculator.setOperation(scanner.next().charAt(0));
            System.out.println(calculator.calc());
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                prompt = scanner.next();
                if (prompt.equalsIgnoreCase("no")) {
                    break;
                }
            } while(!prompt.equalsIgnoreCase("yes"));
        }
    }
}