package Structural.Decorator.TextEditor;

public class ItalicDecorator extends TextDecorator {
    
    public ItalicDecorator(TextView text){
        super(text);
    }

    @Override 
    public String viewText(){
        return "<i>" + this.text.viewText() + "</i>";
    }
}