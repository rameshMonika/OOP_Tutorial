

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MainFrame extends JFrame {
   
    public void initialize(){
        JFrame f1= new JFrame("HELLO");
        f1.setSize(600,600);
        JLabel l1= new JLabel();
        l1.setText("Hello");

        f1.add(l1);

        f1.setVisible(true);
        

    }

    public static void main(String[] args) {
        MainFrame gui = new MainFrame();
        gui.initialize();
    }

  

}

