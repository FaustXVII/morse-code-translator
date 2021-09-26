import java.util.HashMap;
import java.util.Map;

public class MorseCodeDictionary {
    private static Map<Character, String> dictionary = new HashMap<>();

    static {
        dictionary.put('A', "._");
        dictionary.put('B', "_ ...");
        dictionary.put('C', ". .");
        dictionary.put('D', "_..");
        dictionary.put('E', ".");
        dictionary.put('F', "._.");
        dictionary.put('G', "_ _.");
        dictionary.put('H', "....");
        dictionary.put('I', "..");
        dictionary.put('J', "_._.");
        dictionary.put('K', "_._");
        dictionary.put('L', "__");
        dictionary.put('M', "_ _");
        dictionary.put('N', "_ .");
        dictionary.put('O', ". .");
        dictionary.put('P', ".....");
        dictionary.put('Q', ".._.");
        dictionary.put('R', ". ..");
        dictionary.put('S', "...");
        dictionary.put('T', "_");
        dictionary.put('U', ".._");
        dictionary.put('V', "..._");
        dictionary.put('W', ".__");
        dictionary.put('X', "._..");
        dictionary.put('Y', ".. ..");
        dictionary.put('Z', "... .");

        dictionary.put('.', "._._._");
        dictionary.put(',', "__..__");
        dictionary.put('?', "..__..");
        dictionary.put('!', "_._.__");
        dictionary.put(':', "___...");

        dictionary.put(' ', "   ");
    }

    private MorseCodeDictionary(){

    }

    public static String getMorse(final Character character){
        return dictionary.get(character);
    }

}
