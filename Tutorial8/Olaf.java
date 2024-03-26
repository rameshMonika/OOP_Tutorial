public class Olaf extends FrozenCharacter {
    public Olaf(String name) {
        super(name);
    }

    @Override
    public char chooseGesture() {
        // Implement Olaf's gesture selection logic
        // For simplicity, let's say Olaf always chooses 'scissors'
        return 's';
    }
}
