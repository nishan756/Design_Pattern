package Abstract_Factory.GUI;

public class LightGUIFactory implements GUIFactory {
    
    @Override
    public Button createButton(){
        return new LightButton();
    }

    @Override 
    public CheckBox createCheckBox(){
        return new LightCheckBox();
    }

}
