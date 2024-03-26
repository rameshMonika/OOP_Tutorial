import java.util.Random;
import java.util.Scanner;

public class Kristoff extends FrozenCharacter {
    public Kristoff(String name) {
        super(name);
    }

    @Override
    public char chooseGesture() {
        
      
        char[] gestures = {'p', 'r', 's'}; // p for paper, r for rock, s for scissors
      

        System.out.println("Enter a gesture (p for paper, r for rock, s for scissors): ");
        char gestureChoosen = ' ';
        boolean validGesture = false;

        while (!validGesture) {
            // get user input
            Scanner scanner = new Scanner(System.in);   
            String input = scanner.nextLine();
            // check if the input is valid
            if (input.length() == 1) {
                char gesture = input.charAt(0);
                // check if the gesture is in the array
                for (char g : gestures) {
                    if (g == gesture) {
                        gestureChoosen = gesture;
                        validGesture = true;
                        break;
                    }
                }
            }
            if (!validGesture) {
                System.out.println("Invalid gesture. Please enter a valid gesture (p, r, s): ");
            }
        }

        System.out.println("kristoff chose: " + gestureChoosen);



       

        return gestureChoosen;

        
       
      
    }

}
