package designpatterns.structural.flyweight;
public class CharacterStyle {
    private final String font;
    private final int size;
    private final String color;

    //intrinsic data is immutable in flyweight class
    public CharacterStyle(String font, int size, String color) {
        this.font = font;
        this.size = size;
        this.color = color;
    }

    // extrinsic data being passed in method param in flyweight object.
    public void display(char character, int x, int y) {
        System.out.println("Char '" + character + "' at (" + x + "," + y + ") with font: " +
                font + ", size: " + size + ", color: " + color);
    }
}

