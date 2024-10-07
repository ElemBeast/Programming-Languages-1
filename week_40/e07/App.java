import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final Scanner read = new Scanner(System.in);
        boolean isValid = false;

        System.out.println("Type a password at least 8 characters long, containing one uppercase letter (A-Z), one lowercase letter (a-z) and one digit (0-9):");
        
        while (!isValid) {
            String password = read.nextLine();

            if(password.length() < 8) {
                isValid = false;
            }

            boolean hasUpperCase = false;
            boolean hasLowercase = false;
            boolean hasDigit = false;

            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUpperCase = true;                    
                } else if (Character.isLowerCase(c)) {
                    hasLowercase = true;
                } else if (Character.isDigit(c)) {
                    hasDigit = true;
                }
            }

            if (hasUpperCase && hasLowercase && hasDigit) {
                isValid = true;
            }

            if (!isValid) {
                System.out.println("Password is invalid, please try again.");
            }
        }

        System.out.println("Password is valid.");

        read.close();
    }
}