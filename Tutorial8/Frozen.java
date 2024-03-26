import java.util.Random;

public class Frozen {
    public static void main(String[] args) {
        // Parse command-line arguments and create characters accordingly
        // For simplicity, let's assume the inputs are provided correctly
        // and implement the game logic

        // Example usage:
        FrozenCharacter player1 = new Elsa("Elsa");
        FrozenCharacter player2 = new Anna("Anna");
        FrozenCharacter player3 = new Olaf("Olaf");
        FrozenCharacter player4 = new Kristoff("Kristoff");

        char gesture1 = player1.chooseGesture();
        char gesture2 = player2.chooseGesture();
        char gesture3 = player3.chooseGesture();
        char gesture4 = player4.chooseGesture();

        // Perform comparisons and determine winners
        // Implement game logic here
    }
}