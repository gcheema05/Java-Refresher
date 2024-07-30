import java.util.Scanner;

public class LogicalOperatorsMain {
    public static void main(String[] args) throws Exception {
        // Logical operators = used to connect two or more expressions

        // && = (AND) both conditions must be true
        // || = (OR) either condition must be true
        // ! = (NOT) reverses boolean value of condition

        // Using && (AND)

        int temp = 15;

        if (temp > 30) {
            System.out.println("It is hot outside");
        }
        else if (temp >=20 && temp <=30) {
            System.out.println("It is warm outside");
        }
        else {
            System.out.println("It is cold outside");
        }

        // Using || (OR)

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");

        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        }
        else {
            System.out.println("You are still playing the game *PEW PEW*");
        }

        // Using ! (NOT)

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");

        String response2 = scanner.next();

        if (!response2.equals("q") && !response2.equals("Q")) {
            System.out.println("You are still playing the game *PEW PEW*");
        }
        else {
            System.out.println("You quit the game");
        }

        scanner.close();
        scanner2.close();
    }
}
