public class Calculator {
    
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 0;
        char operation = '^';
        int result = 0;
        if(operation == '+') {
            result = num1 + num2;
        } else if(operation == '-') {
            result = num1 - num2;
        } else if(operation == '*') {
            result = num1 * num2;
        } else if(operation == '/') {
            result = num1 / num2;
        } else if(operation == '%') {
            result = num1 % num2;
        } else if(operation == '^') {
            result = 1;
            for(int i = 0; i < num2; i++) {
                result *= num1;
            }
        }
        System.out.println(result);
    }
}