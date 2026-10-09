package Structural.Decorator.TextEditor;

public abstract class TextDecorator implements TextView {
    
    protected final TextView text;

    public TextDecorator(TextView text){
        this.text = text;
    }

}
