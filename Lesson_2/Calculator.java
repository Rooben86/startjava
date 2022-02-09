public class Calculator {
    
    public int calculate(int num1, char operation, int num2) {
        int result = 0;
        switch(operation) {
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                result = num1 / num2;
                break;
            case '%' :
                result = num1 % num2;
                break;
            case '^' :
                result = 1;
                for(int i = 0; i < num2; i++) {
                    result *= num1;
                }
                
            default:
                System.out.println("Некорректная операция. Выберите символы +, -, *, /, % или ^");
        }
        return result;
    }
}