public class Habitat {

    public String environment;

    public Habitat(String environment) {
        this.environment = environment;
    }

    public String getEnvironment() {
        return this.environment;
    }



    public void simulateEnvironment() {
        System.out.println("Simulating " + this.environment + " environment.");
    }

    
}
