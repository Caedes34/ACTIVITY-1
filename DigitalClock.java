import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock {
    public static void main(String[] args) {
        // Create a JFrame window
        JFrame frame = new JFrame("Digital Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        
        // Create a JLabel to display the time
        JLabel label = new JLabel();
        label.setFont(new Font("Serif", Font.BOLD, 50)); // Set font size and style
        label.setHorizontalAlignment(SwingConstants.CENTER);
        
        // Add the label to the frame
        frame.add(label);
        
        // Update the clock every second
        Timer timer = new Timer(1000, e -> {
            // Get current time and format it
            String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
            label.setText(time); // Update label with current time
        });
        timer.start();
        
        // Set the window visible
        frame.setVisible(true);
    }
}
