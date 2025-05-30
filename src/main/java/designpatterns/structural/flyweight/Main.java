package designpatterns.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        drawText("hello world", "Arial", 12, "Black");
        drawText("flyweight pattern", "Arial", 12, "Black");
        drawText("java", "Courier", 10, "Blue");

        System.out.println("Total styles created: " + CharacterStyleFactory.getTotalStyles());
    }

    private static void drawText(String text, String font, int size, String color) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            CharacterStyle style = CharacterStyleFactory.getStyle(font, size, color);
            style.display(c, i, 0);  // x = i, y = 0
        }
    }
}
