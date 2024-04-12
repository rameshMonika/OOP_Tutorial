public class Habitat {
    private String environment;

    public Habitat(String environment) {
        this.environment = environment;
    }

    public void simulateEnvironment() {
        System.out.println("Simulating " + this.environment + " environment.");
    }

    public String getEnvironment() {
        return this.environment;
    }
}

public abstract class Animal {
    private String name;
    private int age;
    private String health;
    private Habitat habitat;

    public Animal(String name, int age, String health, Habitat habitat) {
        this.name = name;
        this.age = age;
        this.health = health;
        this.habitat = habitat;
    }

    // Other methods...

    public Habitat getHabitat() {
        return this.habitat;
    }
}