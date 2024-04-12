

public class Animal extends LivingBeign {
    private Habitat habitat;

    public Animal(String name, int age, String health_status,Habitat habitat){
        super(name, age, health_status);
        habitat= this.habitat;
    }
    

    public void feed(){
        System.out.println("Animal is being fed");
    }

    public void make_sound(){
        System.out.println(" Animal is making sound");
    }

    public Habitat getHabitat() {
        return this.habitat;
    }


    
}
