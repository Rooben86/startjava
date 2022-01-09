public class Calculator {
    
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 5;
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
            int x = 1;
            result = num1;
            while(x < num2) {
                result *= num1;
                x++; 
            }
        }
        System.out.println(result);
    }
}