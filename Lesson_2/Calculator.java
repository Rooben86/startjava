public class Calculator {
    
    int num1;
    int num2;
    char operation;
    int result = 0;

    public int calc() {
        switch(operation) {
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
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                result = 1;
                for(int i = 0; i < num2; i++) {
                    result = num1 * result;
                }
                break;
            default:
                System.out.println("некорректная команда");
        }
        return result;
    }
}