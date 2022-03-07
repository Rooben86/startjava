public class Calculator {
    
    private int num1;
    private int num2;
    private char operation;

    void setNum1(int num1) {
        this.num1 = num1;
    }

    void setNum2(int num2) {
        this.num2 = num2;
    }

    void setOperation(char operation) {
        this.operation = operation;
    }

    public int calc() {
        int result = 0;
        switch(operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '%':
                return num1 % num2;
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