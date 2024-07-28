import java.util.Scanner;

public class UserNameMain {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in); // Set up scanner to take in user input
        int age = 0;
        String name = null;
        String food = null;

        // Prompt user for input
        System.out.println("What is your name?: ");
        name = scanner.nextLine();
        
        System.out.println("How old are you?: ");
        age = scanner.nextInt();

        scanner.nextLine(); // Clears the scanner for next user input
        System.out.println("What is your favorite food?: ");
        food = scanner.nextLine();

        // Print the user input
        System.out.println("\nHello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);

        // Close the scanner
        scanner.close();
    }
}
