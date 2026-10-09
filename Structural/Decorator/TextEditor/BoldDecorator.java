package Structural.Decorator.TextEditor;

public class BoldDecorator extends TextDecorator {
    
    public BoldDecorator(TextView text){
        super(text);
    }

    @Override 
    public String viewText(){
        return "<b>" + this.text.viewText() + "</b>";
    }
}
