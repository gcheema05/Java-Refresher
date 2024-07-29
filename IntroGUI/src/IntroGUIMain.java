import javax.swing.JOptionPane;

public class IntroGUIMain {
    public static void main(String[] args) throws Exception {
        // Prompt for user input using JOptionPane and then display using JOptionPane
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
    }
}
