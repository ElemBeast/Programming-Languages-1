import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final Scanner read = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = read.nextLine();
        System.out.println("You entered: " + name);
        
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        read.close();
    }
}