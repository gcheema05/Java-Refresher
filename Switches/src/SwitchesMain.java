public class SwitchesMain {
    public static void main(String[] args) throws Exception {
        // Switch = statement that allows a variable to be tested for equality against a list of values

        String day = "Pizza";

        switch (day) {
            case "Sunday": System.out.println("It is Sunday!");
            break;
            case "Monday": System.out.println("It is Monday!");
            break;
            case "Tuesday": System.out.println("It is Tuesday!");
            break;
            case "Wednesday": System.out.println("It is Wednesday!");
            break;
            case "Thursday": System.out.println("It is Thursday!");
            break;
            case "Friday": System.out.println("It is Friday!");
            break;
            default: System.out.println("That is not a day!");
        }
    }
}
