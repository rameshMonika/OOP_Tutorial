public class Frozen {

    public static void main(String[] args) {
        if (args.length % 2 != 0) {
            System.out.println("Invalid number of arguments. Please provide an even number of inputs.");
            return;
        }

        Elsa elsa = new Elsa();
        Anna anna = new Anna();

        int elsaWins = 0;
        int annaWins = 0;

        for (int i = 0; i < args.length; i += 2) {
            char elsaChoice = args[i].charAt(0);
            char annaChoice = args[i + 1].charAt(0);

            int winner = getWinner(elsaChoice, annaChoice);
            if (winner == 1) {
                elsaWins++;
            } else if (winner == -1) {
                annaWins++;
            }
        }

        System.out.println("Elsa won: " + elsaWins);
        System.out.println("Anna won: " + annaWins);
    }

    private static int getWinner(char elsaChoice, char annaChoice) {
        if (elsaChoice == annaChoice) {
            return 0; // Draw
        } else if ((elsaChoice == 'r' && annaChoice == 's') ||
                   (elsaChoice == 's' && annaChoice == 'p') ||
                   (elsaChoice == 'p' && annaChoice == 'r')) {
            return 1; // Elsa wins
        } else {
            return -1; // Anna wins
        }
    }
}
