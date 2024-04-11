
import javax.swing.*;

public class FirstSwingExample {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("Click me!");
        b.setBounds(200,200,120,50);

        f.add(b);
        f.setSize(600,400);
        f.setLayout(null);
        f.setVisible(true);

    }
    
}
