package designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterStyleFactory {

    public static final Map<String, CharacterStyle> styles = new HashMap<>();

    public static CharacterStyle getStyle(String font, int size, String color) {
        String key = font + "-" + size + "-" + color;
        styles.putIfAbsent(key, new CharacterStyle(font, size, color));
        return styles.get(key);
    }

    public static int getTotalStyles() {
        return styles.size();
    }
}
