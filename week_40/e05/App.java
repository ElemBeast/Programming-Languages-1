import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final Scanner read = new Scanner(System.in);
        String compName = "";

        System.out.println("Enter your name:");
        String name = read.nextLine();

        while(!name.equalsIgnoreCase("Quit")) {
            compName = compName.concat(name);
            System.out.println(compName);
            System.out.println("Enter your name:");
            name = read.nextLine();
        }

        read.close();
    }
}