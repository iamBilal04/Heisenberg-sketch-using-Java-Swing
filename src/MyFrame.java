import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyPanel panel;

    MyFrame() {

        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.WHITE);
        this.add(panel);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setSize(250,200);
    }
}
