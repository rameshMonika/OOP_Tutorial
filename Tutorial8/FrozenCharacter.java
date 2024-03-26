public abstract class FrozenCharacter {
    protected String name;

    public FrozenCharacter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract char chooseGesture();

  

    // // Overloaded chooseGesture method for program-controlled players
    // public char chooseGesture(char playerChoice) {
    //     return playerChoice;
    // }

}