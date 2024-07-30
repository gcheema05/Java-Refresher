import java.util.Scanner;

public class WhileLoopMain {
    public static void main(String[] args) throws Exception {
        // While loop = executes a block of code as long as it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        // To use a do while loop, move while condition to the bottom and the do to where the while condition is. A do loop
        // will always run the block of code it contains at least once unlike a while loop.

        scanner.close();
    }
}
