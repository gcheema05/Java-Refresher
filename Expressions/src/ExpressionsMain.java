public class ExpressionsMain {
    public static void main(String[] args) throws Exception {
        // Expression = operands and operators
        // Operands = values, variables, numbers, quantity
        // Operators = + - * / %

        int friends = 10;
        double newFriends = 10;

        friends = friends + 1;

        System.out.println(friends);

        friends = friends - 1;

        System.out.println(friends);

        friends = friends * 2;

        System.out.println(friends);

        friends = friends / 2;

        System.out.println(friends);

        friends = friends % 3;

        System.out.println(friends);

        friends++;

        System.out.println(friends);

        friends--;

        System.out.println(friends);

        friends = friends / 2;

        System.out.println(friends);

        newFriends = (double)newFriends / 3;

        System.out.println(newFriends);
    }
}
