

public class Animal extends LivingBeign {

    public Animal(String name, int age, String health_status){
        super(name, age, health_status);
    }

    public void feed(){
        System.out.println("Animal is being fed");
    }

    public void make_sound(){
        System.out.println(" Animal is making sound");
    }


    
}
