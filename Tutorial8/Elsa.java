public class Elsa extends FrozenCharacter {
    public Elsa(String name) {
        super(name);
    }

    @Override
    public char chooseGesture() {
        // Implement Elsa's gesture selection logic
        // For simplicity, let's say Elsa always chooses 'rock'
        return 'r';
    }
}