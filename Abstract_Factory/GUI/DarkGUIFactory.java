package Abstract_Factory.GUI;

public class DarkGUIFactory implements GUIFactory {
    
    @Override 
    public Button createButton(){
        return new DarkButton();
    }

    @Override 
    public CheckBox createCheckBox(){
        return new DarkCheckBox();
    }
}
