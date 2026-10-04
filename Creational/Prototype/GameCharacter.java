package Prototype;
import java.util.ArrayList;
import java.util.List;

public class GameCharacter implements ProtoType<GameCharacter>{

    private String name;

    private List<String> weapons;

    private int attackPower;

    public GameCharacter(String name , List<String> weapons , int attackPower){

        System.out.println("Collecting user data");

        System.out.println("Collecting game data");

        this.name = name;

        this.weapons = weapons;

        this.attackPower = attackPower;

        try {
            Thread.sleep(2000);
        } 
        catch (InterruptedException e) {
            System.out.println("Caught new exception:"+e.toString());
        }

    }

    private GameCharacter(GameCharacter gbc){
        this.name = gbc.name;
        this.weapons = new ArrayList<>(gbc.weapons); //Depp copy
        this.attackPower = gbc.attackPower;
    }

    @Override 
    public GameCharacter CustomClone(){

        return new GameCharacter(this);
    }

    @Override 
    public String toString(){
        return "Name:"+name+"\nWeapons:"+weapons+"\nAttackpower:"+attackPower;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addWeapon(String name){
        this.weapons.add(name);
    }

    public void increaseAttackPower(int power){
        this.attackPower += power;
    }

    public void decreaseAttackPower(int power){
        this.attackPower -= power;
    }
}