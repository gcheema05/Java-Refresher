import java.util.Scanner;

public class MathClassMain {
    public static void main(String[] args) throws Exception {
        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);

        System.out.println(z);

        z = Math.min(x, y);

        System.out.println(z);

        z = Math.abs(y);

        System.out.println(z);

        z = Math.sqrt(x);

        System.out.println(z);

        z = Math.round(x);

        System.out.println(z);

        z = Math.ceil(x);

        System.out.println(z);

        z = Math.floor(x);

        System.out.println(z);

        // ***********Find the hypotenuse of a triangle***********
        System.out.println("\nHypotenuse Calculator\n");

        double a = 0;
        double b = 0;
        double c = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        a = scanner.nextDouble();
        System.out.println("Enter side y: ");
        b = scanner.nextDouble();

        c = Math.sqrt(((a*a) + (b*b)));
        System.out.println("The hypotenuse is: " + c);

        scanner.close();
    }
}
