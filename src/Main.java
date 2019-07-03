import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        showApplication();
    }

    public static void showApplication() {
        /* Sukuriame frame objekta ir parodome varotojui */
        JFrame frame = new JFrame("Celsius_Converter");
        frame.setContentPane(new Celsius_Converter().getPanel1());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}
