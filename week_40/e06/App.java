import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final Scanner read = new Scanner(System.in);
        System.out.println("Palindrome test, please enter some text: ");
        String palindrome = read.nextLine();
        String newWord = "";
        String copy = palindrome.replaceAll("[^A-Za-z]+", "");

        for (int i = copy.length() - 1; i >= 0; i--)  {
            newWord += copy.charAt(i);
        }

        if (newWord.equalsIgnoreCase(copy)) {
            System.out.printf("%s is a palindrome.\n", palindrome);
        } else System.out.printf("%s is not a palindrome.\n", palindrome);

        read.close();
    }
}