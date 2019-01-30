package Ylesanded3.Tervitus;

import java.util.HashMap;

public class Alphabet {
    private static final HashMap<Character, String[]> alphabet = new HashMap<>();

    static {
        alphabet.put('a', new String[]{
                " ###  ",
                "#   # ",
                "##### ",
                "#   # ",
                "#   # "
        });
    // Tähti saab juurde teha
    }

    public static HashMap<Character, String[]> getAlphabet() {
        return alphabet;
    }
}
