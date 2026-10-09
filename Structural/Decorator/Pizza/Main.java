package Structural.Decorator.Pizza;

public class Main {
    
    public static void main(String[] args) {
        Pizza pizza = new NapoletanaPizza();

        System.out.println("Description : " + pizza.getDescription() + "\nPrice : "+pizza.getPrice());

        pizza = new CheeseDecorator(pizza);

        System.out.println("Description : " + pizza.getDescription() + "\nPrice : "+pizza.getPrice());

        pizza = new SauceDecorator(pizza);

        System.out.println("Description : " + pizza.getDescription() + "\nPrice : "+pizza.getPrice());

    }
}