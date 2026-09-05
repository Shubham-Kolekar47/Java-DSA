import javax.swing.*;
import java.awt.*;

public class WelcomeApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Welcome App");
        JLabel label = new JLabel("Welcome to Java!", JLabel.CENTER);

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);

        frame.setVisible(true);

        // Thread to change background color dynamically
        new Thread(() -> {
            try {
                while (true) {
                    int r = (int)(Math.random() * 256);
                    int g = (int)(Math.random() * 256);
                    int b = (int)(Math.random() * 256);

                    frame.getContentPane().setBackground(new Color(r, g, b));

                    Thread.sleep(1000); // change every 1 second
                }
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }).start();
    }
}