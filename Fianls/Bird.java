
public class Bird extends Animal implements behavior{

    public Bird(String name, int age, String health_status) {
        super(name, age, health_status);
    }

    private String feather_color;

    public void layEgg(){
        System.out.println(this.getName()+ "lays egg");
    }

    public void bird_specific_method(){
        System.out.println(this.getName()+"bird specific method");
    }

    public void perform_behaviour(){
        System.out.println(this.getName() + " is performing behaviour for birds");
    }
    
}
