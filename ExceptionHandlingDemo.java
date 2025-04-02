//practical no. 15
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class ExceptionHandlingDemo {
    
    public static double divideNumbers(int num1, int num2) throws NegativeNumberException {
        if (num1 < 0 || num2 < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed in division!");
        }
        return num1 / num2; 
    }

    public static void main(String[] args) {
        int a = 10, b = 0; 
        try {
           
            double result = divideNumbers(a, b);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            double result = divideNumbers(-5, 2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
