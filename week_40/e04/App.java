import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final Scanner read = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = read.nextLine();
        System.out.println("You entered: " + name);
        int size = name.length();

        for (int i = size - 1; i >= 0; i -= 2) {
            System.out.println(name.charAt(i));
        }

        read.close();
    }
}