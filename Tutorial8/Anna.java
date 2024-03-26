// Anna.java
public class Anna extends FrozenCharacter {
    public Anna(String name) {
        super(name);
    }

    @Override
    public char chooseGesture() {
        
        //implement Anna's gesture selection logic
        // how to code it
        char[] gestures = {'p', 'r', 's'}; // p for paper, r for rock, s for scissors
        int randomIndex = new Random().nextInt(gestures.length);
        return gestures[randomIndex];

        
       
      
    }
}
