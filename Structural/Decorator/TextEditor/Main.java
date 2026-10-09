package Structural.Decorator.TextEditor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    
    public static void main(String[] args) {
        
        TextView text = new PlainTextView("Ata Alahy Nishan");

        System.out.println(text.viewText());

        text = new BoldDecorator(text);

        System.out.println(text.viewText());

        text = new ItalicDecorator(text);

        System.out.println(text.viewText());

        text = new UnderlineDecorator(text);

        System.out.println(text.viewText());

        String html = 
        
        """

        <!DOCTYPE html>
        <html>
        
            <head>
                <title>Rich Text Editor</title>
            </head>

            <body>
                <h1>Rich Text Preview</h1>
                <p>%s</p>
            </body>
        
        </html>
                
        """.formatted(text.viewText());
        try {
            Files.writeString(Path.of("preview.html"), html);
            System.out.println("HTML file created successfully!");

        } catch (IOException e) {
            System.out.println("Failed to create HTML file.");

        }

        System.out.println("HTML file created: preview.html");

    }
}