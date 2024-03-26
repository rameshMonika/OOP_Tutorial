public abstract class FrozenCharacter {
    protected String name;

    public FrozenCharacter(String name) {
        this.name = name;
    }

    public abstract char chooseGesture();
}