package patterns.structural.flyweight.improved;


import java.util.HashMap;
import java.util.Map;

public class LetterFactory {

    private final Map<String, Letter> letterMap = new HashMap<String, Letter>();

    public Letter createLetter(String key){
        Letter letter = letterMap.get(key);
        if(letter == null){
            letter = new Letter(key);
            letterMap.put(key,letter);
        }

        return letterMap.get(key);
    }

}
