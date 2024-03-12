public class DivisionExample {
    public static void divideNumbers(int numerator, int denominator) {
        try {
            int result = numerator / denominator;
            System.out.println("Result of the division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is undefined");
        }
    }

    public static void main(String[] args) {
        int numerator = 12;
        int denominator1 = 6;
        int denominator2 = 0;

        System.out.println("Testing with valid denominator:");
        divideNumbers(numerator, denominator1);

        System.out.println("\nTesting with denominator as zero:");
        divideNumbers(numerator, denominator2);
    }
}
