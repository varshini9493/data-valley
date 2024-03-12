import java.lang.Scanner;
public class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }
}

public class Validate_number{
    public static void validateNumber(int number) throws CustomValidationException {
      Scanner sc = new Scanner(Syatem.in);
        if (number < 0) {
            throw new CustomValidationException("Number cannot be negative");
        }
    }

    public static void main(String[] args) {
        try {
            int userInput = sc.nextInt();
            validateNumber(userInput);
            System.out.println("Input is valid: " + userInput);
        } catch (CustomValidationException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
