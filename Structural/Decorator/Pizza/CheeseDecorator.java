package Structural.Decorator.Pizza;

public class CheeseDecorator extends PizzaDecorator {
    
    public CheeseDecorator(Pizza pizza){
        super(pizza);
    }

    @Override 
    public String getDescription(){
        return this.pizza.getDescription() + "\nAdded : Cheese";
    }

    @Override 
    public int getPrice(){

        return this.pizza.getPrice() + 50;
    }
}