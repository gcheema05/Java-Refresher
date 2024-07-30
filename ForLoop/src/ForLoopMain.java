public class ForLoopMain {
    public static void main(String[] args) throws Exception {
        // For loop = executes a block of code a limited amount of times

        for (int i = 0; i <=10; i++) {
            System.out.println(i);
        }

        System.out.println("Happy New Year!");

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("Happy New Year!");

        for (int i = 10; i >= 0; i-=2) {
            System.out.println(i);
        }

        System.out.println("Happy New Year!");

        for (int i = 10; i >= 0;) {
            System.out.println(i);
            i-=2;
        }

        System.out.println("Happy New Year!");
    }
}
