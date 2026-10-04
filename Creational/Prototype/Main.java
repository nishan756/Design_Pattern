package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("Checking time to create 4 GameCharcter object");
        long starttime = System.currentTimeMillis();

        List<String> weapons = new ArrayList<>();

        weapons.add("Gun");
        weapons.add("Rifel");

        GameCharacter character1 = new GameCharacter("Alice", weapons, 100);
        GameCharacter character2 = new GameCharacter("Bob", weapons, 80);
        GameCharacter character3 = new GameCharacter("Charlie", weapons, 60);
        GameCharacter character4 = new GameCharacter("Diana", weapons, 90);

        long endtime = System.currentTimeMillis();

        System.out.println("Time taken to create characters: " + (endtime - starttime) + " milliseconds");

        System.out.println("Checking time to create 4 GameCharcter object by cloning");
        long starttimeClone = System.currentTimeMillis();

        GameCharacter character1Clone = new GameCharacter("Alice", weapons, 100);
        GameCharacter character2Clone = character1Clone.CustomClone();
        GameCharacter character3Clone = character1Clone.CustomClone();
        GameCharacter character4Clone = character1Clone.CustomClone();
        
        long endtimeClone = System.currentTimeMillis();

        System.out.println("Time taken to create characters: " + (endtimeClone - starttimeClone) + " milliseconds");

        character2Clone.addWeapon("Archar");

        System.out.println(character1Clone.toString());
        System.out.println(character2Clone.toString());
        System.out.println(character3Clone.toString());
        System.out.println(character3Clone.toString());
        System.out.println(character4Clone.toString());

    }

}
