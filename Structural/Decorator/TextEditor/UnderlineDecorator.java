package Structural.Decorator.TextEditor;

public class UnderlineDecorator extends TextDecorator{

    public UnderlineDecorator(TextView text){
        super(text);
    }

    @Override
    public String viewText(){
        return "<u>" + this.text.viewText() + "</u>";
    }
}