package Structural.Decorator.Pizza;

public class NapoletanaPizza implements Pizza{


    @Override 
    public String getDescription(){

        return "This is NapoletanaPizza";
    }

    @Override 
    public int getPrice(){

        return 200;
    }
    
}