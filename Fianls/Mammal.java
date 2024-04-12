


package Fianls;







public class Mammal extends Animal implements behavior {

    public Mammal(String name, int age, String health_status) {
        super(name, age, health_status);
    }
    private String fur_color;
    
    public String getFurColor(){
        return fur_color;
    }

    public void give_birth(){
        /// print it gives birth with it's name
        System.out.println(this.getName() + " Gives birth");



    }

    public void mammal_specific_method(){
        System.out.println(this.getName() + " specific method");
    }

    public void perform_behaviour(){
        System.out.println(this.getName() + " is performing behaviour for mammals");
    }
    
}
