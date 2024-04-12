import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.*;

public class Frozen {

    public static void main(String[] args) {
        gameRounds();
    }

    private static void gameRounds() {
        Scanner user_input = new Scanner(System.in);
        Elsa player_1 = new Elsa();
        Anna player_2 = new Anna();

        while (true) {

                // create a frame for the game using swing

                JFrame f = new JFrame("Frozen Game");
                f.setSize(600, 600);
                f.setLayout(null);

                // create a text field for anna to enter her moves
                //create combo box to choose between r, p and s
           




                JTextField anna = new JTextField();
                anna.setBounds(200, 100, 120, 50);
                f.add(anna);
               
                // create a text field for elsa to enter her moves
                JTextField elsa = new JTextField();
                elsa.setBounds(200, 200, 120, 50);
                f.add(elsa);

                // create a submit button to submit the moves
                JButton submitButton = new JButton("Submit");
                submitButton.setBounds(200, 300, 120, 50);
                f.add(submitButton);

                // create a label which would be later used to display the result of the game
                JLabel resultLabel = new JLabel();
                resultLabel.setBounds(200, 400, 120, 50);
                f.add(resultLabel);



                //on click of the submit button get the text from the text field
                submitButton.addActionListener(e -> {
                    String text = anna.getText();
                    String text2 = elsa.getText();
                    // determine winner using the checkWinner method

                    if (checkUserinput(text + " " + text2)) {
                        String[] input_split = (text + " " + text2).split(" ");

                        for (int y = 0; y < input_split.length / 2; y++) {
                            System.out.println("\nRound " + (y + 1));
                            setAction(player_1, null, text);
                            setAction(null, player_2, text2);
                            CheckWinner(player_1, player_2);
                        }


                        

                         GameWinner(player_1, player_2);
                        // dialog box to show the result of the game
                        JOptionPane.showMessageDialog(f, "Elsa: " + player_1.getPoint() + " Anna: " + player_2.getPoint());
                        try (//create a txt file to store the result of the game
                        BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"))) {
                            writer.write("Elsa: " + player_1.getPoint() + " Anna: " + player_2.getPoint());
                            writer.close();
                        } catch (IOException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }
                        // write the result of the game to the txt file
                        // return result of the value winner from GameWinner method
                        resultLabel.setText(GameWinner(player_1, player_2));

                       





                      


                    } else {
                        System.out.println("Invalid input! Please provide moves in the format rps rps.");
                    }

                   
                });


            

                // create a text field for the user to enter the moves
                // create a submit button to submit the moves
                // create a label to display the result of the game
                // create a label to display the winner of the game
                // create a label to display the total points of the game
                // create a label to display the total rounds of the game

                f.setVisible(true);
               







            System.out.println("Enter Elsa's and Anna's moves separated by a space: ");
            String defaultMovesInput = user_input.nextLine().toLowerCase();

            if (checkUserinput(defaultMovesInput)) {
                String[] input_split = defaultMovesInput.split(" ");

                for (int y = 0; y < input_split.length / 2; y++) {
                    System.out.println("\nRound " + (y + 1));
                    setAction(player_1, null, input_split[y * 2]);
                    setAction(null, player_2, input_split[y * 2 + 1]);
                    CheckWinner(player_1, player_2);
                }


                GameWinner(player_1, player_2);
                break;
            } else {
                System.out.println("Invalid input! Please provide moves in the format rps rps.");
            }
        }
    }

    private static String GameWinner(Elsa p1, Anna p2) {
        String Winner;
        if (p1.getPoint() > p2.getPoint()) {
            Winner = "Elsa!";
        } else if (p1.getPoint() < p2.getPoint()) {
            Winner = "Anna!";
        } else {
            Winner = "It's a tie!";
        }
        return Winner;








    }


    private static void setAction(Elsa p1, Anna p2, String user_input) {
        int player_index = (p1 == null) ? 1 : 0;
        switch (user_input) {
            case "s":
                if (player_index == 0) {
                    p1.setScissors();
                } else {
                    p2.setScissors();
                }
                break;
            case "r":
                if (player_index == 0) {
                    p1.setRock();
                } else {
                    p2.setRock();
                }
                break;
            case "p":
                if (player_index == 0) {
                    p1.setPaper();
                } else {
                    p2.setPaper();
                }
                break;
        }
    }

    private static void CheckWinner(Elsa p1, Anna p2) {
        int result = (p1.getMove() - p2.getMove()) % 3;
        if (result == 0) {
            p1.SetPoint();
            p2.SetPoint();
            System.out.println("It's a tie!");
        } else if (result == 1) {
            p1.SetPoint();
            System.out.println("Elsa wins!");
        } else {
            p2.SetPoint();
            System.out.println("Anna wins!");
        }
        System.out.println("Total Point\nElsa won: " + p1.getPoint() + "\nAnna won: " + p2.getPoint());
    }

    private static boolean checkUserinput(String userInput) {
        return userInput.matches("([rps] [rps] )*[rps] [rps]");
    }


}
