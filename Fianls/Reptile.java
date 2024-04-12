

public class Reptile extends Animal implements behavior{

    public Reptile (String name, int age, String health_status) {
        super(name, age, health_status, new Habitat("Land"));
    }

  

    private String scale_color;

    public String getScaleColor(){
        return scale_color;
    }

    public void reptile_specific_method(){
        System.out.println(this.getName()+ " reptile specific method ");
    }

    public void perform_behaviour(){
        System.out.println(this.getName() + " is performing behaviour for reptiles");
    }
    
}
