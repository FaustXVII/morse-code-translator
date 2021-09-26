public class MorseCodeTranslator {

    String toMorseCode(String text){
        text = text.toUpperCase();
        final StringBuilder morseCode = new StringBuilder();

        for(int i = 0; i < text.length(); i++)
            morseCode.append(MorseCodeDictionary.getMorse(text.charAt(i)));

        return morseCode.toString();
    }
}
