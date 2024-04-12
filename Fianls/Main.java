

public class Main {

    public static void main(String[] args) {
     
        Mammal dog = new Mammal("Dog", 10, "Good");
        dog.feed();
        dog.give_birth();
        dog.make_sound();
        dog.mammal_specific_method();
        dog.perform_behaviour();

        Reptile snake = new Reptile("Snake", 5, "Good");
        snake.feed();
        snake.make_sound();
        snake.reptile_specific_method();

        Bird parrot = new Bird("Parrot", 2, "Good");
        parrot.feed();
        parrot.make_sound();
        parrot.layEgg();
        parrot.bird_specific_method();




    }
    
}
