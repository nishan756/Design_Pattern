package Abstract_Factory.GUI;

public class Main {
    
    public static void main(String[] args) {
        
        // Dark GUI
        GUIFactory dark = new DarkGUIFactory();

        Button darkBtn = dark.createButton();

        darkBtn.render();

        CheckBox darkCheckBox = dark.createCheckBox();

        darkCheckBox.render();

        // Light GUI

        GUIFactory light = new LightGUIFactory();

        Button lightBtn = light.createButton();

        lightBtn.render();

        CheckBox lightCheckBox = light.createCheckBox();

        lightCheckBox.render();


    }
}
