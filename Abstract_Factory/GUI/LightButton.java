package Abstract_Factory.GUI;

public class LightButton implements Button {
    
    @Override 
    public void render(){
        System.out.println("Rendering light button");
    }
}
