import java.util.HashMap;
import java.util.Map;

public class CharacterTile extends Tile {
    char symbol;

    public CharacterTile(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public boolean matches(Tile other) {
        return super.matches(other) && this.symbol == ((CharacterTile) other).symbol;
    }

    public String toString() {
        Map<String, String> validSymbolDictionary = new HashMap<>();
        String s = String.valueOf(symbol);
        validSymbolDictionary.put("1", "Character 1");
        validSymbolDictionary.put("2", "Character 2");
        validSymbolDictionary.put("3", "Character 3");
        validSymbolDictionary.put("4", "Character 4");
        validSymbolDictionary.put("5", "Character 5");
        validSymbolDictionary.put("6", "Character 6");
        validSymbolDictionary.put("7", "Character 7");
        validSymbolDictionary.put("8", "Character 8");
        validSymbolDictionary.put("9", "Character 9");
        validSymbolDictionary.put("N", "North Wind");
        validSymbolDictionary.put("E", "East Wind");
        validSymbolDictionary.put("W", "West Wind");
        validSymbolDictionary.put("S", "South Wind");
        validSymbolDictionary.put("C", "Red Dragon");
        validSymbolDictionary.put("F", "Green Dragon");
        if (validSymbolDictionary.containsKey(s)) return validSymbolDictionary.get(s);
        return "Invalid character string";
    }
}

