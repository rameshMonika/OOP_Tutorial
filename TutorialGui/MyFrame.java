import javax.swing.*;
import java.awt.*;


    public class MyFrame {

        public MyFrame(){

            JFrame f1=new JFrame();

            f1.setSize(640,400);
            f1.setLocation(0,0);
            f1.setTitle("JFrame");

            f1.setLayout(new GridLayout(5,5));

            // Lable
            JLabel myLabel =new JLabel("Lable 1");
            f1.add(myLabel);

            // Button
            JButton myButton=new JButton("Click me");
            f1.add(myButton);

            //text field

            JTextField myTextField = new JTextField(" Text ...");
            f1.add(myTextField);

            // Password field

            JPasswordField pwdField = new JPasswordField();
            f1.add(pwdField);

            // Textarea field
            JTextArea myTextArea = new JTextArea();
            JScrollPane myScrollPane =new JScrollPane(myTextArea);
            f1.add(myScrollPane);

            // checkbox
            JCheckBox myCheckBox = new JCheckBox("JCheckBok");
            f1.add(myCheckBox);

            // radio


            JPanel myRadioBtnGrpLabel=new JPanel();

            JRadioButton myRadioButton1=new JRadioButton("JRadio Button 1");
            JRadioButton myRadioButton2=new JRadioButton("JRadio Button 2");
            JRadioButton myRadioButton3=new JRadioButton("JRadio Button 3");
            f1.add(myRadioButton1);
            f1.add(myRadioButton2);
            f1.add(myRadioButton3);
            ButtonGroup buttonGroup=new ButtonGroup();
            buttonGroup.add(myRadioButton1);
            buttonGroup.add(myRadioButton2);
            buttonGroup.add(myRadioButton3);
            myRadioBtnGrpLabel.add(myRadioButton1);
            myRadioBtnGrpLabel.add(myRadioButton2);
            myRadioBtnGrpLabel.add(myRadioButton3);

            f1.add(myRadioBtnGrpLabel);


            //dropdown box

            String [] myComboItems=new String[]{"Item 1","Item 2","Item 3"};
            JComboBox<String> myComboBox=new JComboBox<>(myComboItems);

            f1.add(myComboBox);

            // Slider 
            JSlider mySlider = new JSlider (0,100,3);
            f1.add(mySlider);



            






            f1.setVisible(true);

        }

        public static void main(String[] args) {
            new MyFrame();
         }
      

    }

   

