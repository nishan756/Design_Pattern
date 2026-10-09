package Structural.Decorator.TextEditor;

public class PlainTextView implements TextView {
    
    private final String text;

    public PlainTextView(String text){
        this.text = text;
    }

    @Override 
    public String viewText(){
        return this.text;
    }
}
