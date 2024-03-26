import java.util.Random;
import java.util.Scanner;

public class Frozen {
    public static void main(String[] args) {
     

        // Example usage:
        FrozenCharacter Elsa1 = new Elsa("Elsa");
        FrozenCharacter Anna1 = new Anna("Anna");
        FrozenCharacter Olaf1 = new Olaf("Olaf");
        FrozenCharacter Kristoff1 = new Kristoff("Kristoff");

        // store the characters in an array
        FrozenCharacter[] characters = {Elsa1, Anna1, Olaf1, Kristoff1};

        // point system for firstPlayer and secondPlayer

        int firstPlayerPoint = 0;
        int secondPlayerPoint = 0;
        int winner = 0;




        // Choose the first player from the array
        System.out.println("Choose the first player: ");
        // print the characters in the array
        for (int i = 0; i < characters.length; i++) {
            System.out.println((i + 1) + ". " + characters[i].getName());
        }

       
        Scanner scanner = new Scanner(System.in);
        int firstPlayer = scanner.nextInt();


        System.out.println("Choose the first player: ");
        for (int i = 0; i < characters.length; i++) {
            System.out.println((i + 1) + ". " + characters[i].getName());
        }
        int secondPlayer = scanner.nextInt();
       
       // call the gessure of the first player and second player
        char gesture1 = ' ';
        char gesture2 = ' ';
        // convert the code below to make the players dynamic based on the array




    
            gesture1 = characters[firstPlayer-1].chooseGesture();
            gesture2 = characters[secondPlayer-1].chooseGesture();



   


        // function determine winner
        winner=determineWinner(firstPlayer, secondPlayer, gesture1, gesture2);
        if (winner == 1) {
            firstPlayerPoint++;
        } else if (winner == 2) {
            secondPlayerPoint++;
        }
        
      
        System.out.println("Player " + firstPlayer + " has " + firstPlayerPoint + " points");
        System.out.println("Player " + secondPlayer + " has " + secondPlayerPoint + " points");
    
        

        


        



        





       


        // Perform comparisons and determine winners
        // Implement game logic here
    }
    // function determine winner
    //return the winner

    public static int determineWinner(int firstPlayer, int secondPlayer, char gesture1, char gesture2) {
        if (gesture1 == gesture2) {
            System.out.println("It's a tie!");
            return 0;
        } else if (gesture1 == 'p' && gesture2 == 'r') {
            System.out.println("Player " + firstPlayer + " wins!");
            return 1;
        } else if (gesture1 == 'r' && gesture2 == 's') {
            System.out.println("Player " + firstPlayer + " wins!");
            return 1;
        } else if (gesture1 == 's' && gesture2 == 'p') {
            System.out.println("Player " + firstPlayer + " wins!");
            return 1;
        } else {
            System.out.println("Player " + secondPlayer + " wins!");
            return 2;
        }
    }
}