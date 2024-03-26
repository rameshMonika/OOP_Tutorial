import java.util.Random;

public class Kristoff extends FrozenCharacter {
    public Kristoff(String name) {
        super(name);
    }

    @Override
    public char chooseGesture() {
        // Implement Kristoff's gesture selection logic
        // For simplicity, let's say Kristoff's choice is random
        Random random = new Random();
        int choice = random.nextInt(3);
        switch (choice) {
            case 0:
                return 'r';
            case 1:
                return 'p';
            default:
                return 's';
        }
    }
}
