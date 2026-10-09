package Structural.Decorator.Pizza;

public class SauceDecorator extends PizzaDecorator {
    
    public SauceDecorator(Pizza pizza){
        super(pizza);
    }

    @Override 
    public String getDescription(){
        return this.pizza.getDescription() + "\nAdded : "+"Sauce";
    }

    @Override 
    public int getPrice(){
        return this.pizza.getPrice() + 10;
    }
}
